package com.mvc.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.Accountant;
import com.mvc.dao.accfunct;
import com.mvc.util.DBConnection;
 

public class ppServlet extends HttpServlet {
  
     public ppServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
    	 ServletContext servletContext = getServletContext();
    	 PrintWriter out = response.getWriter();  
         response.setContentType("text/html");  
         Double budget=(Double)(servletContext.getAttribute("budget"));
    	 int vid = Integer.parseInt(request.getParameter("numb"));
    	 accfunct a = new accfunct();
    	 int d = a.Do_transaction(budget,vid);
    	 out.println("<html><body>");
    	 if(d==1) {
    		 out.println("<h1>Completed purchase</h1>");
    	 }
    	 else if(d==0) {

    		 out.println("<h1>Request a loan</h1>");
    	 }
    	 out.println("</body></html>");
     }
}