package com.mvc.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dao.spfunct;
 

public class getpriceServlet extends HttpServlet {
  
     public getpriceServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 PrintWriter out = response.getWriter();  
         response.setContentType("text/html");
         
    	 int v_id = Integer.parseInt(request.getParameter("numb"));
    	 spfunct spf=new spfunct();
    	 Double price=spf.present_quotation(v_id);
    	 
    	 out.println("<html><body>");
    	 out.println("<h3>Price of the vehicle is "+String.valueOf(price)+"</h3>");
    	 out.println("</html></body>");
    	 System.out.println("price="+price);
     
     }
}