
/*
 * Problem: 实现一个Web应用程序，可以将用户发送的name请求参数画在一张图片上
 * re:
 * 	String name = req.getParameter("name");
 * 	g.drawString(name, 20, 20);
 * 成功实现将name请求参数画到图片上
 * tips: 动态的生成图片，用ServletOutputStream类，getOutputStream()对浏览器字节输出
 * */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

@WebServlet("/show.view")
public class ImageShow extends HttpServlet {
public void doGet(HttpServletRequest req, 
		HttpServletResponse res) 
				throws ServletException, IOException {
	res.setContentType("image/jpeg");
	BufferedImage bufferedImage = new BufferedImage(300, 200, BufferedImage.TYPE_INT_RGB);
	
	Graphics g = bufferedImage.getGraphics();
	g.setColor(Color.white);
	g.setFont(new Font("Arial Black", 
	Font.ITALIC | Font.BOLD, 20));
	
	String name = req.getParameter("name");
	g.drawString(name, 20, 20);
	
	g.setColor(Color.red);
	g.fillOval(40, 40, 20, 20);
	g.setColor(Color.green);
	g.fillRect(80, 80, 50, 50);
	
	OutputStream out = res.getOutputStream();
	JPEGImageEncoder encoder = 
	JPEGCodec.createJPEGEncoder(out); 
	encoder.encode(bufferedImage);
	out.close();
	}
} 