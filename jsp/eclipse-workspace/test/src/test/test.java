package test;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.annotation.WebServlet;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

@WebServlet("/test.view")
public class test extends HttpServlet {
public void doGet(HttpServletRequest request, 
		HttpServletResponse response) 
				throws ServletException, IOException {
	int width = 60;
	int height = 20;
	// 创建具有可访问图像数据缓冲区的Image
	BufferedImage buffImg = new BufferedImage(width, height,
			BufferedImage.TYPE_INT_RGB);
	Graphics g = buffImg.getGraphics();
	
	// 创建一个随机数生成器
	Random random = new Random();
	
	g.setColor(Color.WHITE);
	g.fillRect(0, 0, width, height);
	
	// 创建字体，字体的大小应该根据图片的高度来定
	Font font = new Font("Times New Roman", Font.PLAIN, 18);
	// 设置字体
	g.setFont(font);
	
	// 画边框
	g.setColor(Color.BLACK);
	g.drawRect(0, 0, width - 1, height - 1);
	
	// 随机产生160条干扰线
	g.setColor(Color.LIGHT_GRAY);
	for (int i = 0; i < 160; i++) {
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int x1 = random.nextInt(12);
		int y1 = random.nextInt(12);
		g.drawLine(x, y, x + x1, y + y1);
	}
	
	// randomCode 用于保存随机产生的验证码
	StringBuffer randomCode = new StringBuffer();
	int red = 0, green = 0, blue = 0;
	
	// 随机产生4位数字的验证码
	for (int i = 0; i < 4; i++) {
		// 得到随机产生的验证码数字
		String strRand = String.valueOf(random.nextInt(10));
	
		// 产生随机的颜色分量来构造颜色值
		red = random.nextInt(110);
		green = random.nextInt(50);
		blue = random.nextInt(50);
	
		// 用随机产生的颜色将验证码绘制到图像中
		g.setColor(new Color(red, green, blue));
		g.drawString(strRand, 13 * i + 6, 16);
	
		randomCode.append(strRand);
	}
	
	// 将四位数字的验证码保存到session中
	HttpSession session = request.getSession();
	session.setAttribute("randomCode", randomCode.toString());
	
	// 禁止图像缓存
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	
	response.setContentType("image/jpeg");
	// 将图像输出到servlet输出流中
	ServletOutputStream sos = response.getOutputStream();
	ImageIO.write(buffImg, "jpeg", sos);
	sos.close();
	//sos = null;
	PrintWriter out = response.getWriter();

}
}