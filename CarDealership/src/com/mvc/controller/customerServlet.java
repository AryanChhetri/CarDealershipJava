package com.mvc.controller;
import java.io.IOException;
import java.lang.Math;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.Customer;
import com.mvc.bean.RegisterBean;
import com.mvc.dao.customerfunct;
import com.mvc.util.DBConnection;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*; 

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class customerServlet extends HttpServlet {
  
     public customerServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 
    	 String name = (request.getParameter("fullname"));
         String addr = (request.getParameter("address"));
         int b_id = Integer.parseInt(request.getParameter("b_id"));
         double budget = Double.parseDouble(request.getParameter("budget"));
         String phnum = request.getParameter("phnum");
         ServletContext servletContext = getServletContext();
         servletContext.setAttribute("budget",budget);
         //make a call to model to create new customer
         int c_id=(int)(Math.random()*15000);
         Customer c = new Customer(name,addr,c_id,b_id,budget,phnum);
         customerfunct c1=new customerfunct();
         String t = c1.newcust(c);
         System.out.println(t);
         //customer created and added to database
         
         PrintWriter out = response.getWriter();  
         response.setContentType("text/html");  
         
         out.println("<html><body>");
         out.println("<h1>chose employee</h1>");
//         Connection con;
// 		 PreparedStatement ps = null;
// 		 
         try {
 			Connection con = DBConnection.createConnection();
 			String q = "Select * from salesperson where b_id = ?";
 			PreparedStatement ps = con.prepareStatement(q);
 			ps.setInt(1,b_id);
 			ResultSet rs = ps.executeQuery();
 			while(rs.next()) {
 				out.println("<h3>-------------------------------</h3>");
 				out.println("<h5>Branch id:"+rs.getString(1)+"</h5>");
 				out.println("<h5>Employee id:"+rs.getString(2)+"</h5>");
 				out.println("<h5>Rating :"+rs.getString(4)+"</h5>");
 				out.println("<h3>-------------------------------</h3>");
 				
 			}
 		}
 		catch(Exception e) {
 			e.printStackTrace();
 		
 		}
         out.println("<h4>Your Customer id is"+c_id+"</h4>");
         out.println("<form name=\"form\" method = \"post\" action = \"anotherServlet\" > ");
         out.println("Enter Customer id");
         out.println("<input type=\"number\" id = \"model\" name = \"custid\" value = \"Enter c_id\"></input>");
         out.println("Enter desired employee id");
         out.println("<input type=\"number\" id = \"model\" name = \"empno\"></input>");
         out.println("<input type=\"submit\" value=\"Submit\"></input>");
//         out.println("<script type=\"text/javascript\">");
//         out.println("function myFunction() {");
//         out.println("var model= document.getElementById('model');\r\n"
//         		+ "    alert(\"You entered: \" + model.value);");
//         
//         
//         out.println("}");
//         out.println("</script>");
         out.println("</body></html>");
         
         
         
         
         
     }
}