package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class fpServlet extends HttpServlet {
  
     public fpServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         int num = Integer.parseInt(request.getParameter("numb"));
         if(num==1) {
        	  request.getRequestDispatcher("/customer.jsp").forward(request, response); 
         }
         else {
        	 request.getRequestDispatcher("/employee.jsp").forward(request, response);
         }
     
     }
}