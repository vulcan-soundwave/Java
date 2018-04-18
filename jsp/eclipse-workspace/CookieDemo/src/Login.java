
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                         HttpServletResponse response)
                      throws ServletException, IOException {
    	
        String user = request.getParameter("user");
        String passwd = request.getParameter("passwd");
        if("soundwave".equals(user) && "123456".equals(passwd)) {
            String login = request.getParameter("login");
	         // login参数值为auto，表示自动登陆
            if("auto".equals(login)) {
            		// 创建Cookie，设定一星期内有效，并新增至响应中
            	Cookie cookie = new Cookie("user", "soundwave");
            	cookie.setMaxAge(7 * 24 * 60 * 60);
            	response.addCookie(cookie);
            }
            
            request.setAttribute("user", user);
            request.getRequestDispatcher("user.view")
                    .forward(request, response);
        }
        else {
            response.sendRedirect("login.html");
        }
    }
} 
