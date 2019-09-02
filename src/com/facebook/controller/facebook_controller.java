package com.facebook.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebook.entity.FacebookEmployee;
import com.facebook.service.FacebookService;

/**
 * Servlet implementation class facebook_controller
 */
@WebServlet("/facebook_controller")
public class facebook_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public facebook_controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FacebookServiceInterface fs=FacebookService.createObject("fservice");
		FacebookEmployee fe=new FacebookEmployee();
		fe.setAddress("abcd");
		fe.setEmail("Ankit@gmail.com");
		fe.setName("Anki Singh");
		fe.setPassword("welcome123");
		
		int i=fs.createProfile(fe);
		
	}

}
