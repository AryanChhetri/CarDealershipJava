package com.mvc.dao;
import java.util.Scanner;

import com.mvc.util.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class spfunct{
	
    public Double present_quotation(int v_id){
    	 
    	try {
  			Connection con = DBConnection.createConnection();
  			String q = "Select * from vehicle where v_id = ?";
  			PreparedStatement ps = con.prepareStatement(q);
  			ps.setInt(1,v_id);
  			ResultSet rs = ps.executeQuery();
  			Double price=0.0;
  			while(rs.next()) {
  				price = rs.getDouble(3);
  			}
  			return price;
  		}
  		catch(Exception e) {
  			e.printStackTrace();
  		}
    	return 0.0;
    }
}