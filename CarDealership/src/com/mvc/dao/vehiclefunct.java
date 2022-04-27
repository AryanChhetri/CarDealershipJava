package com.mvc.dao;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

import com.mvc.bean.Vehicle;
import com.mvc.util.DBConnection;
import com.mysql.jdbc.PreparedStatement;

public class vehiclefunct{

   public String delete(Vehicle v) {
	   
	   int v_id = v.getId();
	   Connection con= null;
	   int ra=0;
	   try {
		   con = DBConnection.createConnection();
		   String sql = "Delete from vehicle where v_id = ?";
		   java.sql.PreparedStatement ps=con.prepareStatement(sql);
		   ps.setInt(v_id, v_id);
		   ra = ps.executeUpdate();
		   con.close();
		   return "SUCCESS";
		   
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   return "Error";
   }
   
}