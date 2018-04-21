
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user.view")
public class User extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        	
           //无法取得登录字符login，重定向到登录窗口
        if(session.getAttribute("login") == null) {
        		response.sendRedirect("login.html");
          }
        else {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01" +
            " Transitional//EN'>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>欢迎 "
                    + session.getAttribute("login") + "</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>使用者 " + session.getAttribute("login") 
            		+ " 已登入</h1><br><br>");
            out.println("<a href='logout.view'>登出</a>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
