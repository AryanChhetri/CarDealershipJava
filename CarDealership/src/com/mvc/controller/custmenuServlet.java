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

import com.mvc.util.DBConnection;
 

public class custmenuServlet extends HttpServlet {
  
     public custmenuServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
    	 System.out.println("Wehere");
    	 ServletContext servletContext = getServletContext();
    	 PrintWriter out = response.getWriter();  
         response.setContentType("text/html");  
         int cust_id=(Integer)(servletContext.getAttribute("c_id"));
    	 int choice = Integer.parseInt(request.getParameter("numb"));        
         System.out.println("cust_id = "+cust_id);
         
         if(choice==1) {
        	 try {
      			Connection con = DBConnection.createConnection();
      			String q = "Select * from customer where c_id = ?";
      			PreparedStatement ps = con.prepareStatement(q);
      			ps.setInt(1,cust_id);
      			ResultSet rs = ps.executeQuery();
      			int b_id=0;
      			while(rs.next()) {
      				b_id=Integer.parseInt(rs.getString(5));
      			}
      			//got b id now printing vehicles
      			q = "Select * from vehicle where b_id = ?";
      			ps = con.prepareStatement(q);
      			ps.setInt(1,b_id);
      			rs = ps.executeQuery();
      			
      			out.println("<html><body>");
      	        out.println("<h1>Available Vehicles (Please select vehicle id of the liked vehicle)</h1>");
      			while(rs.next()) {
      				out.println("<h3>-------------------------------</h3>");
      				out.println("<h5>Branch Id =" + rs.getString(1)+"</h5>");
      				out.println("<h5>Vehicle Id =" + rs.getString(2)+"</h5>");
      				out.println("<h5>mileage =" + rs.getString(4)+"</h5>");
      				out.println("<h5>model =" + rs.getString(5)+"</h5>");
      				out.println("<h5>-------------------------------</h5>");
      			}
      			out.println("</body></html>");
      			//printed
      		}
      		catch(Exception e) {
      			e.printStackTrace();}
         }
         
         else if(choice==2) {
        	 request.getRequestDispatcher("/VehicleChoice.jsp").forward(request, response);
         }
         
         else if(choice==3){
        	 request.getRequestDispatcher("/pp.jsp").forward(request, response);
         }
         
     
     }
}