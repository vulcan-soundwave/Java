
/*
 * Problem: 动态产生四位数字验证码
 * re:彩色不规则高度数字
 * tips: 动态的生成图片，是Project->ImageShowPrac->name请求参数动态画到图片的延伸
 * */


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

@WebServlet("/show_2")
public class VerifyCode_2 extends HttpServlet {
	int width = 100;
	int height = 25;
//	private String codes="23456789abcdefghijkmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ";
   private Random random = new Random();
    
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
	
		response.setContentType("image/jpeg");
		BufferedImage bufferedImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		
		Graphics g = bufferedImage.getGraphics();
		//画边框
		g.setColor(Color.white);
		g.setFont(new Font("Arial Black", Font.ITALIC | Font.BOLD, 20));
		g.drawRect(0, 0, width - 1, height - 1);
		
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
	   //HttpSession session = request.getSession();  
	   //session.setAttribute("randomCode", randomCode.toString());  
	    
	    
		//String name = req.getParameter("name");
		g.drawString(randomCode.toString(), 20, 20);
		
		OutputStream out = response.getOutputStream();
		JPEGImageEncoder encoder = 
		JPEGCodec.createJPEGEncoder(out); 
		encoder.encode(bufferedImage);
		out.close();
	}
} 