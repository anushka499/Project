package com.studentmanagement.AllServlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentmanagement.config.DBconfig;
@WebServlet(description = "abc servlet to save data on database", urlPatterns = { "/abc" })
public class abc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname=request.getParameter("sname");
		String semail=request.getParameter("semail");
		String scourse=request.getParameter("scourse");
		String pass=request.getParameter("pass");
		
		String sql="insert into students(sname,semail,scourse,pass) values('"+sname+"' , '"+semail+"' , '"+scourse+"','"+pass+"' )";
		int i=DBconfig.executeUpdate(sql);
		PrintWriter out=response.getWriter();
		if(i>=0)
		{
		try {
			String sql1="select * from students";
			out.println("<h1>Inserted successfully</h1>");
			ResultSet rs=DBconfig.executeQuery(sql1);
			rs.last();
		out.println("Your ID has been generated:"+rs.getInt("sid"));
		}
		catch(Exception se)
		{
			se.printStackTrace();
		}
		}
			else
			out.println("unsuccessful"+i);
	}
}
