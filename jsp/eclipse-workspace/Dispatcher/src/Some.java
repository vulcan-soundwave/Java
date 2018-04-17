
import java.io.IOException;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Some
 */
@WebServlet("/some.view")
public class Some extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Some do one...");
        //RequestDispatcher dispatcher = request.getRequestDispatcher("other.view");
        RequestDispatcher dispatcher = request.getRequestDispatcher("other.view?data=123456");
        //dispatcher.include(request, response);
        out.println("Some do two...");
        out.close();
    }

}

