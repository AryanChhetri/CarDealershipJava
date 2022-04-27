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
 

public class dvServlet extends HttpServlet {
  
     public dvServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         
         int vid = Integer.parseInt(request.getParameter("vid"));
         
         GeneralManagerfunct gmf = new GeneralManagerfunct();
         gmf.delete_vehicel(vid);
         request.getRequestDispatcher("/gm.jsp").forward(request, response);
    	 
         
     
     }
}