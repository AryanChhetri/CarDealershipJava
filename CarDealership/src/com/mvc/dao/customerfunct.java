package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvc.bean.Customer;
import com.mvc.util.DBConnection;
 
public class customerfunct{
	
	public String newcust(Customer c) {
		Connection con;
		PreparedStatement ps = null; 
		try {
			con = DBConnection.createConnection();
			String query = "insert into customer values (?,?,?,NULL,?,?,?)";
			ps = con.prepareStatement(query);
			
			 ps.setString(1, c.getName());
             ps.setString(2, c.getAddress());
             ps.setInt(3, (c.getCustid()));
             ps.setInt(4, (c.b_id));
             ps.setDouble(5,(c.getBudget()));
             ps.setString(6, c.getphnum());
             
             int i= ps.executeUpdate();
             if (i!=0)  //Just to ensure data has been inserted into the database
                 return "SUCCESS";   
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Fail";
		}
		return null;
	}
	
	
	public void choose_employee(int c_id,int empno) {
		Connection con;
		PreparedStatement ps = null;
		try {
			con = DBConnection.createConnection();
			String query = "update customer set e_id=? where c_id=?";
			ps = con.prepareStatement(query);
			
			ps.setInt(1, empno);
			ps.setInt(2, c_id);
			
			int i= ps.executeUpdate();
			
			
			//after choosing employee id it must be update on employee database also
			query = "Select cust_id from salesperson where e_id=?";
			ps = con.prepareStatement(query);
			ps.setInt(1, empno);
			ResultSet rs = ps.executeQuery();
			String cids=null;
			while(rs.next()) {
				 cids=(rs.getString(1));
			}
			 cids = cids.substring(0,cids.length()-1);
			 
		 
			String new_cids = cids+","+String.valueOf(c_id)+"}";
			System.out.println(new_cids);
			//update employee database
	        
			 query = String.format("Update salesperson set cust_id =\'%s\'  where e_id=?",new_cids);
			 ps = con.prepareStatement(query);
			 System.out.println(ps);
			 ps.setInt(1, empno);
			 ps.executeUpdate();
			 
			 //updated
		}
		catch(Exception e) {e.printStackTrace();}
		
	}
	
	
	public void view_vehicles() {
		
	}
	
	public void request_quotation() {
		
	}
	
	public void purchase() {
		
	}
	
	public void buy_loan() {
		
	}

}