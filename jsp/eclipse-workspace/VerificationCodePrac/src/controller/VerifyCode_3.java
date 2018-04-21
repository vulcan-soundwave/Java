package controller;

/*
 * Problem: 动态产生四位数字验证码，且送出窗体后需要经过密码验证才可观看到用户界面
 * re:
 * 		彩色不规则高度数字
 * 		结合会话管理机制HttpSession类
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

@WebServlet("/show_3")
public class VerifyCode_3 extends HttpServlet {
	int width = 100;
	int height = 25;
   private Random random = new Random();
   private final String LOGIN_VIEW = "login.do";
   
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
	    
	    // 随机产生4位数字的验证码  
	    for (int i = 0; i < 4; i++) {  
	        // 得到随机产生的验证码数字  
	        String strRand = String.valueOf(random.nextInt(10));  
	        g.drawString(strRand, 0, 0);  
	        randomCode.append(strRand);  
	    }  
	     
	   String passwd = randomCode.toString();
		g.drawString(passwd, 20, 20);
		
		HttpSession session = request.getSession();
		session.setAttribute("passwd", passwd);
		
		OutputStream out = response.getOutputStream();
		JPEGImageEncoder encoder = 
		JPEGCodec.createJPEGEncoder(out); 
		encoder.encode(bufferedImage);
		out.close();
	}
} 