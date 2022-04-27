package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class yetanotherServlet extends HttpServlet {
  
     public yetanotherServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         int num = Integer.parseInt(request.getParameter("numb"));
         if(num==1) {
        	  request.getRequestDispatcher("/sp.jsp").forward(request, response); 
         }
         else if(num==2){
        	 request.getRequestDispatcher("/acc.jsp").forward(request, response);
         }
         else {
        	 request.getRequestDispatcher("/gm.jsp").forward(request, response);
         }
     
     }
}