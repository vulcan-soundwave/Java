
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/encoding")
public class EncodingServlet extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
            		throws ServletException, IOException {
        String name = request.getParameter("nameGet");
        //name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println("GET: " + name);
    }
    
    protected void doPost(HttpServletRequest request,
    		HttpServletResponse response)
    				throws ServletException,IOException {
    	request.setCharacterEncoding("UTF-8");
    	String name = request.getParameter("namePost");
    	System.out.println("POST: " + name);
    }

}

/*
 * error：get提交中文表单乱码
 * solve：<meta http-equiv="Content-Type" content="text/html; charset=BIG5">是BIG5啊!!!看仔细!!!
 * re：BIG5改成UTF-8
 * tips：tomcat8以后默认编码格式是utf-8；7及之前的都是iso-8859-1，所以get不需要自己改编码了，但是post还是需要哦～ 
 */
