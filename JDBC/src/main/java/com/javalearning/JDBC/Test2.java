package com.javalearning.JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test2 {
    public static void addEmployee(Scanner sc){
    	try {
    	System.out.println("Add details :");
    	System.out.println("Enter emp_id:");
    	int id = sc.nextInt();
    	System.out.println("Enter emp_name:");
    	String name = sc.next();
    	System.out.println("Enter emp_dept:");
    	String dept = sc.next();
    	
    	String sql = "insert into emp_info (emp_id,emp_name,dept_name) values (?,?,?)";
    	
			PreparedStatement ps = ConnectionUtil.getConnection()
					              .prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, dept);
			
			ps.executeUpdate();
			System.out.println("Data inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		addEmployee(sc);

	}

}
