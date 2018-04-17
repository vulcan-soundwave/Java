
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class Download extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String passwd = request.getParameter("passwd");
        if ("123456".equals(passwd)) {
        		//设置内容类型
        		response.setContentType("application/pdf"); 
        		//取得输入串流
        		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/jdbc.pdf");
        		//取得输出串流
        		OutputStream out = response.getOutputStream();
        		//读取PDF并输出至浏览器
        		writeBytes(in, out);
        }
    }

    private void writeBytes(InputStream in, OutputStream out)
            throws IOException {
        byte[] buffer = new byte[1024];
        int length = -1;
        while ((length = in.read(buffer)) != -1) {
            out.write(buffer, 0, length);
        }
        in.close();
        out.close();
    }
}
