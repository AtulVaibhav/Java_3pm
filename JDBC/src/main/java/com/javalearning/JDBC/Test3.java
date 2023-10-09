package com.javalearning.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

//BatchProcessing
public class Test3 {
   public static void addEmployee(){
	   try {
		Statement stmt = ConnectionUtil.getConnection().createStatement();
	    String sql1 = "insert into emp_info values(104,'Rahul','R&D')";
	    String sql2 = "insert into emp_info values(105,'Yogesh','HR')";
	    String sql3 = "insert into emp_info values(106,'Vivek','HRD')";
	    stmt.addBatch(sql1);
	    stmt.addBatch(sql2);
	    stmt.addBatch(sql3);
	    stmt.executeBatch();
	    System.out.println("Data added successfully");
	   
	   } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
	public static void main(String[] args) {
		addEmployee();

	}

}
