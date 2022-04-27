package com.mvc.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.GeneralManager;
import com.mvc.dao.GeneralManagerfunct;
import com.mvc.util.DBConnection;
 

public class addvServlet extends HttpServlet {
  
     public addvServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         int bid = Integer.parseInt(request.getParameter("bid"));
         int vid = Integer.parseInt(request.getParameter("vid"));
         
         int cost = Integer.parseInt(request.getParameter("cost"));
         int mileage = Integer.parseInt(request.getParameter("mileage"));

         String model = (request.getParameter("model"));
         
         GeneralManagerfunct gmf = new GeneralManagerfunct();
         gmf.add_vehicel(bid,vid,cost,mileage,model);
         request.getRequestDispatcher("/gm.jsp").forward(request, response);
    	 
         
     
     }
}