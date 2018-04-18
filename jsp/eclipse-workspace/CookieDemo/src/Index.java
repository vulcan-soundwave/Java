
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.do")
public class Index extends HttpServlet {
    protected void processRequest(HttpServletRequest request,
                                HttpServletResponse response)
                       throws ServletException, IOException {
    	  //取得Cookie
    	  Cookie[] cookies = request.getCookies();  
    	  
    	  //如果这个Cookie名称和数值符合，表示允许自动登陆
        if (cookies != null) {  
            for (Cookie cookie: cookies) {  
            // 这里设定只有登陆过并且选择自动登录复选框后只将登录账户保存至Cookie  
            // 密码就不保存了，下次就直接凭账户就能登录，密码保存至Cookie容易被解析  
                String name = cookie.getName();  
                String value = cookie.getValue(); // 有Cookie信息就要解析是否是登录账号  
                if ("user".equals(name) && "soundwave".equals(value)) {  
                // 这里设定只能有一个账户user=soundwave  
                // 由于是自动登录并且保存过信息，因此无需密码直接登录  
                    request.setAttribute(name, value); // 用对象属性包装并转发给视图来显示  
                    // 不要直接将登录信息作为GET请求参数，一般账户信息都需要隐藏起来  
                    // 不要直接以"/user.view?${name}=${value}"的形式转发  
                    request.getRequestDispatcher("/user.view")
                    		.forward(request, response);  
                    return ;  
                }  
            }  
        }  
           //如果没Cookie信息则重定向到登录页面
        response.sendRedirect("login.html");   

    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                             throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                            throws ServletException, IOException {
        processRequest(request, response);
    }
} 