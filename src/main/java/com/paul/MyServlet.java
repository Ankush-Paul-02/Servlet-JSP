package com.paul;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/addAlien")
public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
			
		PrintWriter out = res.getWriter();
		
		int aid = Integer.parseInt(req.getParameter("aid"));
		String aname = req.getParameter("aname");
		
		out.println("welcome " + aname);
		
	}
}
