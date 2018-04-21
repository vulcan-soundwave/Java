package controller;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

@WebServlet("/login.do")
public class Login extends HttpServlet {
    private final String USERS = "/home/soundwave/file/github/Java/jsp/test/users";
    private final String SUCCESS_VIEW = "Success.html";
    private final String ERROR_VIEW = "form.html";
    
	protected void doPost(HttpServletRequest request, 
	                      HttpServletResponse response) 
	                        throws ServletException, IOException {
	    String password = request.getParameter("password");
	    String page = ERROR_VIEW;
	    HttpSession session = request.getSession();
	    if(session.getAttribute("passwd").equals(password)) {
	        page = SUCCESS_VIEW;
	     }
	    response.sendRedirect(page);
	}
 
}
