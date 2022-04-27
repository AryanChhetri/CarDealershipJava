package com.mvc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mvc.util.DBConnection;

public class accfunct{
	 
    public int Do_transaction(Double budget,int vid){
    	Connection con;
		PreparedStatement ps = null; 
		try {
			con = DBConnection.createConnection();
			String query = "select cost from vehicle where v_id = ?";
			ps = con.prepareStatement(query);
			
			 ps.setInt(1, vid);
             ResultSet rs= ps.executeQuery();
             Double price=0.0;
             while(rs.next()) {
            	 price=Double.parseDouble(rs.getString(1));
             }
              if(budget>price) {
            	  
            	
            	query = "delete from vehicle where v_id = ?";
      			ps = con.prepareStatement(query);
      			ps.setInt(1, vid);
                int i= ps.executeUpdate();
                return 1;
              }
              else {
            	  return 0;
              }
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
    	return 0;
    }

    public void Finance_loans(){

    }
}