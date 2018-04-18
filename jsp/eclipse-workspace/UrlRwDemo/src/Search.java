
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/search.view")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
   @Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {

	   response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println(" <head>");
		out.println("  <title>搜索结果</title>");
		out.println(" </head>");
		out.println(" <body>");
	
		String page = request.getParameter("page");
		if (page == null) {
			page = "1";
		}
		
		int count = Integer.parseInt(page);
		int begin = count * 10 - 9;
		int end = count * 10;
		
		out.println("第" + begin + " 到" + end + " 搜索结果<br>");
		out.println("</ul>");
		
		for (int i = 1; i <= 10; i++)
			out.println("<li>搜索结果" + (i+(count-1)*10) + "</li>");
		out.println("</ul>");
		
		for (int i = 1; i <= 10; i++) {
			if (i == count) { // 当前页面的页码无超链接
				out.println(i);
				continue;
			}
			out.println("<a href='search.view?page=" + i + "'>" + i + "</a>\n");
		}
		
		out.println("<body>");
		out.println("<html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}