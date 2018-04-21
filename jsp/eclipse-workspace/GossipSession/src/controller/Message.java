package controller;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/message.do")
public class Message extends HttpServlet {
    private final String USERS = "/home/soundwave/file/github/Java/jsp/test/users";
    private final String LOGIN_VIEW = "index.html";
    private final String SUCCESS_VIEW = "member.view";
    private final String ERROR_VIEW = "member.view";
    
    
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                             throws ServletException, IOException {
        //若无"login"属性，直接重定向到登录窗口
    	if(request.getSession().getAttribute("login") == null) {
    		response.sendRedirect(LOGIN_VIEW);
    		return;
    	}
    	
    	request.setCharacterEncoding("UTF-8");
    	String info = request.getParameter("info");
    	
    	//如果内容新增信息小于140字，保存到用户目录中的字文档
    	if(info != null && info.length() != 0) {
    		if(info.length() < 140) {
    			String username = (String) request.getSession().getAttribute("login");
    			addMessage(username, info);
    			response.sendRedirect(SUCCESS_VIEW);
    		} else {
    			//否则转发会员网页
    			request.getRequestDispatcher(ERROR_VIEW)
    				.forward(request, response);
    		}
    	} else {
    		//如果没有信息重定向会员网页
    		response.sendRedirect(ERROR_VIEW);
    	}
	    
	}

    private void addMessage(String username, String info) throws IOException {
    	//信息保存至.txt，并以日期毫秒数为文件名
        String file = USERS + "/" + username + "/" + new Date().getTime() + ".txt";
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        writer.write(info);
        writer.close();
    }
    
    

}
