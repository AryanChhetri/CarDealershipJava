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
 

public class deServlet extends HttpServlet {
  
     public deServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         int mid = Integer.parseInt(request.getParameter("mid"));
         int bid = Integer.parseInt(request.getParameter("bid"));
         int eid = Integer.parseInt(request.getParameter("eid"));
         int oeid = Integer.parseInt(request.getParameter("oeid"));
         
         GeneralManager g = new GeneralManager(mid,bid,eid);
         GeneralManagerfunct gmf = new GeneralManagerfunct();
         gmf.handle_employee_database(g,oeid);
         request.getRequestDispatcher("/gm.jsp").forward(request, response);
    	 
         
     
     }
}