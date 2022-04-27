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
 

public class wowanotherServlet extends HttpServlet {
  
     public wowanotherServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         int num = Integer.parseInt(request.getParameter("numb"));
         //do for adding and deleting vehicle if time is there
         
         if(num==1) {
        	 PrintWriter out = response.getWriter();  
             response.setContentType("text/html");
        	 try {
       			Connection con = DBConnection.createConnection();
       			String q = "Select * from salesperson";
       			PreparedStatement ps = con.prepareStatement(q);
       			ResultSet rs = ps.executeQuery();
       			while(rs.next()) {
       				out.println("<h3>---------------------------</h3>");
       				out.println("<h4>Branch Id = "+rs.getString(1)+"</h4>");
       				out.println("<h4>Employee id Id = "+rs.getString(2)+"</h4>");
       				out.println("<h4>customers ="+rs.getString(3)+"</h4>");
       				out.println("<h4>Rating= "+rs.getString(4)+"</h4>");
       				out.println("<h3>---------------------------</h3>");
       				
       			}
       			out.println("</body></html>");
       		}
       		catch(Exception e) {
       			e.printStackTrace();} 
         }
         
         else if(num==2) {
        	 request.getRequestDispatcher("/crgm.jsp").forward(request, response);
        	 
        }
         
         else if(num==3){
        	 PrintWriter out = response.getWriter();  
             response.setContentType("text/html");
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
         else if(num==4) {
        	 request.getRequestDispatcher("/degm.jsp").forward(request, response);
         }
         else if(num==5) {
        	 request.getRequestDispatcher("/addvgm.jsp").forward(request, response);
         }
         else if(num==6) {
        	 request.getRequestDispatcher("/dvgm.jsp").forward(request, response);
         }
         else {
        	 request.getRequestDispatcher("/gm.jsp").forward(request, response);
         }
     
     }
}