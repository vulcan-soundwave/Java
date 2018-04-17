package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello.view")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelloServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	//主要核心代码是doget()
	response.setContentType("text/html;charest=UTF-8");
	PrintWriter out =response.getWriter();
	String name = request.getParameter("name");
	
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Hello Servlet</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h1> Hello! " + name + " !</h1>");
	out.println("</body>");
	out.println("</html>");
	
	out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
