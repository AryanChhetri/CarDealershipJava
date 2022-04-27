package com.mvc.util;
 
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBConnection {
 public static Connection createConnection()
 {	
	String jdbcurl="jdbc:postgresql://localhost:5432/dealership";
 	String usn="postgres";
 	String password="password";
    System.out.println("In DBConnection.java class ");
    Connection conn = null;
    try{
        conn = DriverManager.getConnection(jdbcurl,usn,password);
        System.out.println("Connected to postgres");
    }
    catch(Exception e) {
    	System.out.print(e);
    }
    return conn;
      
 }
}