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

import com.mvc.dao.customerfunct;
import com.mvc.util.DBConnection;
 

public class anotheroneServlet extends HttpServlet {
  
     public anotheroneServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
    	 int num = Integer.parseInt(request.getParameter("numb"));
    	 PrintWriter out = response.getWriter();  
         response.setContentType("text/html");
         out.println("<html><body>");
         if(num==1) {
        	 try {
       			Connection con = DBConnection.createConnection();
       			String q = "Select * from vehicle";
       			PreparedStatement ps = con.prepareStatement(q);
       			ResultSet rs = ps.executeQuery();
       			while(rs.next()) {
       				out.println("<h3>---------------------------</h3>");
       				out.println("<h4>Branch Id = "+rs.getString(1)+"</h4>");
       				out.println("<h4>Vehicle Id = "+rs.getString(2)+"</h4>");
       				out.println("<h4>Cost = "+rs.getString(3)+"</h4>");
       				out.println("<h4>Mileage= "+rs.getString(4)+"</h4>");
       				out.println("<h4>model = "+rs.getString(5)+"</h4>");
       				out.println("<h3>---------------------------</h3>");
       				
       			}
       			out.println("</body></html>");
       		}
       		catch(Exception e) {
       			e.printStackTrace();}
         }
         out.println("</body></html>");
     
     }
}