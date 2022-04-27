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
 

public class nrServlet extends HttpServlet {
  
     public nrServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         int mid = Integer.parseInt(request.getParameter("mid"));
         int bid = Integer.parseInt(request.getParameter("bid"));
         int eid = Integer.parseInt(request.getParameter("eid"));
         int oeid = Integer.parseInt(request.getParameter("oeid"));
         int nr= Integer.parseInt(request.getParameter("nr"));
         
         GeneralManager g = new GeneralManager(mid,bid,eid);
         GeneralManagerfunct gmf = new GeneralManagerfunct();
         gmf.rate_employee(g,oeid,nr);
         request.getRequestDispatcher("/gm.jsp").forward(request, response);
    	 
         
     
     }
}