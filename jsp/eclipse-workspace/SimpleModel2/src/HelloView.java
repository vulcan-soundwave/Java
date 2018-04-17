
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

@WebServlet("/hello.view")
public class HelloView extends HttpServlet {
    private String htmlTemplate = 
          "<html>"
        + "  <head>" 
        + "    <meta http-equiv='Content-Type'"
        + "        content='text/html; charset=UTF-8'>"
        + "    <title>%s</title>" 
        + "  </head>" 
        + "  <body>"
        + "    <h1>%s</h1>" 
        + "  </body>" 
        + "</html>";

    @Override
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {
    	String name = req.getParameter("user");	//取得请求参数
      String message = (String) req.getAttribute("mess");//取得请求属性，两个servlet共享的属性
    	String html = String.format(htmlTemplate, name, message);//产生HTML结果
      resp.getWriter().println(html);//输出HTML结果
       	
    }
}
