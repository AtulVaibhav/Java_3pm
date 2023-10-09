package com.javalearning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	private static final String username = "root";
	private static final String password = "root";
	private static final String url = "jdbc:mysql://localhost:3306/emp_db";
   
	
	public static Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			if(con==null){
			  con = DriverManager.getConnection(url, username, password);
			}	
		}catch(Exception e){
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		return con;
    	
    }
	public static void main(String[] args) {
		 Connection con=null;
		try{
		  con = Test.getConnection();
		  System.out.println(con);
		}finally{
			try {
				con.close();
				System.out.println("connection closed successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
