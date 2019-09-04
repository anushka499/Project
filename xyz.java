
package com.studentmanagement.AllServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import studentmanagement.config.DBconfig;

//@WebServlet(description = "to retrieve data from database", urlPatterns = { "/xyz" })
public class xyz extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			int flag = 0, sql2;
			int sid = Integer.parseInt(request.getParameter("sid"));
			String pass = request.getParameter("pass");
			PrintWriter out = response.getWriter();
			//String sql1 = "select * from students where sid=" + sid + " and pass='" + pass + "'";
			String sql1 = "select * from students";
			ResultSet rs = DBconfig.executeQuery(sql1);
			String sql; 
			//sql2=rs.getInt("sid");
			if (rs != null ) {
				//rs.first();
				//out.println("<h1 style='background:red;color:white'>Your details are:</h1>");
				//out.println("<h3>Student id is:</h3>"+rs.getInt("sid")+"<br>");
				  //out.println("<h3>Student password is:</h3>"+rs.getString("pass")+"<br>");
				  //out.println("<h3>Name is:</h2>"+rs.getString("sname")+"<br>");
				  //out.println("<h3>Student course is:</h2>"+rs.getString("scourse")+"<br>");
				 //out.println("<h3>Student email is:</h3>"+rs.getString("semail")+"<br>");
				
				 while(rs.next()) { sql2=rs.getInt("sid"); sql=rs.getString("pass");
				 if(pass.equalsIgnoreCase(sql) && sid==sql2) { flag=1;
				 out.println("<h1 style='background:red;color:white'>Your details are:</h1>");
				 out.println("<h3>Student id is:</h3>"+sid+"<br>");
				 out.println("<h3>Student password is:</h3>"+sql+"<br>");
				 out.println("<h3>Name is:</h2>"+rs.getString("sname")+"<br>");
				 out.println("<h3>Student course is:</h2>"+rs.getString("scourse")+"<br>");
				 out.println("<h3>Student email is:</h3>"+rs.getString("semail")+"<br>");
				 break; }
                				 
				 }
			}
				
				 if(flag==0) {
				 out.println("<h1>Login failed</h1><br><h2>Wrong student id or password</h2>"
				 ); }
				
				rs.close();
			}
			//else {
				//out.println("<h1>Login failed</h1><br><h2>Wrong student id or password</h2>");
			//}
		//} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
