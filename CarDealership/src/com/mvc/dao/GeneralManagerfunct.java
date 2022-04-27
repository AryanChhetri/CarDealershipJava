package com.mvc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mvc.bean.GeneralManager;
import com.mvc.util.DBConnection;

public class GeneralManagerfunct{
    
	public void rate_employee(GeneralManager g,int eid,int nr){
		
		try {
  			Connection con = DBConnection.createConnection();
  			String q = "Update salesperson set rating = ? where e_id=?";
  			PreparedStatement ps = con.prepareStatement(q);
  			ps.setInt(1,nr);
  			ps.setInt(2,eid);
  			ResultSet rs = ps.executeQuery();
  			
  		}
  		catch(Exception e) {
  			e.printStackTrace();
  		}
    }

	public void add_vehicel(int bid,int vid,int cost, int mileage,String model) {
		
		try {
  			Connection con = DBConnection.createConnection();
  			String q = "insert into vehicle values(?,?,?,?,?)";
  			PreparedStatement ps = con.prepareStatement(q);
  			ps.setInt(1,bid);
  			ps.setInt(2,vid);
  			ps.setInt(3,cost);
  			ps.setInt(4,mileage);
  			ps.setString(5,model);
  			ResultSet rs = ps.executeQuery();
  			
  		}
  		catch(Exception e) {
  			e.printStackTrace();
  		}
    }

	public void delete_vehicel(int vid) {
		
		try {
  			Connection con = DBConnection.createConnection();
  			String q = "delete from vehicle where v_id=?";
  			PreparedStatement ps = con.prepareStatement(q);
  			ps.setInt(1,vid);
  			ResultSet rs = ps.executeQuery();
  			
  		}
  		catch(Exception e) {
  			e.printStackTrace();
  		}
    }

	
    public void handle_employee_database(GeneralManager g,int eid){
    	try {
  			Connection con = DBConnection.createConnection();
  			String q = "delete from salesperson where e_id = ?";
  			PreparedStatement ps = con.prepareStatement(q);
  			ps.setInt(1,eid);
  			ResultSet rs = ps.executeQuery();
  			
  		}
  		catch(Exception e) {
  			e.printStackTrace();
  		}
    }

    public void handle_complaints(){

    }

}