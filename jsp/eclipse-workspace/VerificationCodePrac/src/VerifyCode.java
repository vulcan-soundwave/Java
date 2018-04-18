
/*
 * Problem: 动态产生四位数字验证码
 * re:
 * 
 * tips: 动态的生成图片，是Project->ImageShowPrac->name请求参数动态画到图片的延伸
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
public class VerifyCode extends HttpServlet {
public void doGet(HttpServletRequest req, 
		HttpServletResponse res) 
				throws ServletException, IOException {
	
	res.setContentType("image/jpeg");
	int width = 100;
	int height = 25;
	BufferedImage bufferedImage = new BufferedImage(width, height,
			BufferedImage.TYPE_INT_RGB);
	
	Graphics g = bufferedImage.getGraphics();
	//画边框
	g.setColor(Color.white);
	g.setFont(new Font("Arial Black", Font.ITALIC | Font.BOLD, 20));
	g.drawRect(0, 0, width - 1, height - 1);
	
	String name = req.getParameter("name");
	g.drawString(name, 20, 20);
	
	OutputStream out = res.getOutputStream();
	JPEGImageEncoder encoder = 
	JPEGCodec.createJPEGEncoder(out); 
	encoder.encode(bufferedImage);
	out.close();
	}
} 