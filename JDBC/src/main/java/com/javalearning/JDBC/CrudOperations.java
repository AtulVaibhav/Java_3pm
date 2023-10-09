/**
 * insertion :INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);

   update :UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;

   delete :DELETE FROM table_name WHERE condition;
 * 
 * 
 * 
 */


package com.javalearning.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperations {
    public static void addEmployee(){
    	Statement stmt;
    	try {
			 stmt= ConnectionUtil.getConnection().createStatement();
    	    String sql = "insert into emp_info (emp_id,emp_name,dept_name) values (102,'Aditya','Development')";
    	    int i = stmt.executeUpdate(sql);
    	    System.out.println(i+" row affected");
    	
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
    
    
    public static void getAll(){
    	try {
			Statement stmt = ConnectionUtil.getConnection().createStatement();
		    String sql = "select * from emp_info";
		    ResultSet set = stmt.executeQuery(sql);
		    
		    while(set.next()){
		    	System.out.println("EmpId :"+set.getInt(1)+
		    			" EmpName :"+set.getString(2)+
		    			" DeptName :"+set.getString(3));
		    } 
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public static void getById(){
    	try {
			Statement stmt = ConnectionUtil.getConnection().createStatement();
			 String sql = "select * from emp_info where emp_id=102";
			 ResultSet set = stmt.executeQuery(sql);
			    
			    while(set.next()){
			    	System.out.println("EmpId :"+set.getInt(1)+
			    			" EmpName :"+set.getString(2)+
			    			" DeptName :"+set.getString(3));
			    } 
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static void updateEmployee(){
    	try{
    	Statement stmt = ConnectionUtil.getConnection().createStatement();
    	String sql = "update emp_info set dept_name='Testing' where emp_id=102";
    	int i = stmt.executeUpdate(sql);
    	System.out.println("update successfully");
    	
    	}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	}
    
    public static void deleteById(){
    	try{
    		Statement stmt = ConnectionUtil.getConnection().createStatement();
        	String sql = "delete from emp_info where emp_id=102";
        	stmt.executeUpdate(sql);
        	System.out.println("employee having id=102 deleted successfully");
    	}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	public static void main(String[] args) {
		System.out.println("Employee Database :");
		//addEmployee();
		//getAll();
		//getById();
//		getAll();
//		updateEmployee();
//		getAll();
		
		getAll();
		deleteById();
		getAll();
		

	}

}
