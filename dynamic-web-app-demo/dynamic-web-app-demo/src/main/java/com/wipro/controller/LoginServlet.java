package com.wipro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.wipro.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * If Http method is GET, the form data is appended to the url and sent to the server in the foll. format:
 * 
 * 				url?querystring
 * 
 *		query string format:
 *				name=value&name=value
 *
 *	Ex.
 *		http://localhost:8081/dynamic-web-app-demo/login?userid=Srini&password=Srini%40123
 *
 *		While sending sensitive data or large amount of data to the server, apply HttP POST/PUT methods
 *
 *
 *	request.getParameter() return type is String, so when receiving non-string data from the browser
 *convert String data to corresponding types.
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
//			String email = request.getParameter("email");
//			String password =  request.getParameter("password");
//			
		
//			User user = new User(email,password);
			
//			System.out.println(request.getParameter("birthdate"));
			//convert String to LocalDate
			LocalDate birthdate = LocalDate.parse(request.getParameter("birthdate"));
			
			User user = new User(request.getParameter("email"), 
					request.getParameter("password"), birthdate);
			
			out.println("<html><body><h2>Your Credentials:"+ user.getEmail()+","+
									user.getPassword()+","+ user.getBirthdate()+"</h2></body></html>");
//			ServletContext context = this.getServletContext();
//			out.println("<br><h2>"+context.getInitParameter("database")+"</h2>");
			
			System.out.println(user);
		
		}catch(Exception e) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,e.getMessage());
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
