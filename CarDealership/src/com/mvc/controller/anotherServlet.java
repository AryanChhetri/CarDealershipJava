package com.mvc.controller;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dao.customerfunct;
 

public class anotherServlet extends HttpServlet {
  
     public anotherServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
    	ServletContext servletContext = getServletContext();
         int c_id = Integer.parseInt(request.getParameter("custid"));
         int empno = Integer.parseInt(request.getParameter("empno"));
         customerfunct c1=new customerfunct();
         c1.choose_employee(c_id,empno);
         
         servletContext.setAttribute("c_id",c_id);
         request.getRequestDispatcher("/customermenu.jsp").forward(request, response);
         
     
     }
}