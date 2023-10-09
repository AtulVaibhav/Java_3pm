package com.javalearning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
   private static Connection con = null;
   private static final String url = "jdbc:mysql://localhost:3306/emp_db";
   private static final String username = "root";
   private static final String password = "root";
   
   public static Connection getConnection(){
	   if(con==null){
		 try{
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(url, username, password);
			 
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	   }
	   return con;
   }
}
