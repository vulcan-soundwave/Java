package controller;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register.do")
public class Register extends HttpServlet {
    private final String USERS = "/home/soundwave/Desktop/users";
    private final String SUCCESS_VIEW = "success.view";
    private final String ERROR_VIEW = "error.view";

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
	        //取得请求参数
	    	String email = request.getParameter("email");
	    	String username = request.getParameter("username");
	    	String password = request.getParameter("password");
	    	String confirmedPasswd = request.getParameter("confirmedPasswd");
	    	
	    	//验证请求参数
	    	List<String> errors = new ArrayList<String>();
	    	if(isInvalidEmail(email)) {
	    		errors.add("未填写邮件或邮件格式不正确");
	    	}
	    	if(isInvalidUsername(username)) {
	    		errors.add("用户名称为空或已存在");
	    	}
	    	if(isInvalidPassword(password, confirmedPasswd)) {
	    		errors.add("请确认密码符合格式并再次确认密码");
	    	}
	    	//窗体验证出错，设置收集错误的的List为请求属性
	    	String resultPage = ERROR_VIEW;
	    	if(!errors.isEmpty()) {
	    		request.setAttribute("errors", errors);
	    	}else {
	    		resultPage = SUCCESS_VIEW;
	    		//创建用户资料
	    		createUserData(email, username, password);
	    	}
	    	request.getRequestDispatcher(resultPage)
	    		.forward(request, response);
	    		
    }

    private boolean isInvalidEmail(String email) {
    	
        return email == null || !email.matches("^[_a-z0-9-]+([.]"
                        + "[_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$");
		
    	//return email == null || !email.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
    }
    //通过检查用户资料文件夹是否创建来确认用户是否已注册
    private boolean isInvalidUsername(String username) {
        for (String file : new File(USERS).list()) {
            if (file.equals(username)) {
                return true;
            }
        }
        return false;
    }

    private boolean isInvalidPassword(String password, String confirmedPasswd) {
        return password == null || password.length() < 6
                || password.length() > 16 || !password.equals(confirmedPasswd);
    }
    //在profile中存储邮件和密码
    private void createUserData(String email, String username, String password)
            throws IOException {
        File userhome = new File(USERS + "/" + username);
        userhome.mkdir();
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(userhome + "/profile"));
        writer.write(email + "\t" + password);
        writer.close();
    }
}
