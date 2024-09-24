package com.serverdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Test  extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		int a=Integer.parseInt(req.getParameter("t1"));
		int b=Integer.parseInt(req.getParameter("t2"));
	
		PrintWriter ptr=null;
		try {
			ptr=res.getWriter();
		}
		catch(IOException e)
		{
			System.out.println("the pb is"+e);
		}
		ptr.write("the result: "+(a+b));
		
		}
	}
