package cc.openhome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello.do")
public class HelloController extends HttpServlet {
    private HelloModel model = new HelloModel();
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                      throws ServletException, IOException {
        /*
         * 实作步骤1到4内容
         * 
         */
    }
}
