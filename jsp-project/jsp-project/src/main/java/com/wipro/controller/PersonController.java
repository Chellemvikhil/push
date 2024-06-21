package com.wipro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.wipro.model.Person;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {	
			PrintWriter out = response.getWriter();
			
			Person person = new Person();
			
			person.setAdharCard(Long.parseLong(request.getParameter("adhar")));
			person.setFirstName(request.getParameter("first"));
			person.setLastName(request.getParameter("last"));
			person.setAddress(request.getParameter("address"));
			person.setMobile(Long.parseLong(request.getParameter("mobile")));
			
			request.setAttribute("person", person);
			
			request.getRequestDispatcher("/WEB-INF/views/person.jsp").forward(request, response);
			
		}catch(Exception e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST , e.getMessage());
		}
	}	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
