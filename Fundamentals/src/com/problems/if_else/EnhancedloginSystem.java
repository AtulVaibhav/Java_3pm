package com.problems.if_else;

import java.util.Scanner;

public class EnhancedloginSystem {
	static String storedUserName;
	static String storedPassword;
	static {
		 storedUserName="admin";
		 storedPassword = "admin";
	}
    public static void loginSystem(Scanner obj){
    	//System.out.println(obj.hashCode());
    	System.out.println("Enter the userName");
    	String user = obj.next();
    	if(user.equals(EnhancedloginSystem.storedUserName)){
    		System.out.println("Inside if block");
    		System.out.println("Enter your password");
    		String pwd = obj.next();
    		if(pwd.equals(EnhancedloginSystem.storedPassword)){
    			System.out.println("Welcome "+user);
    		}else{
    			System.out.println("Invalid Password");
    		}
    		
    	}else{
    		System.out.println("Invalid Username");
    	}
    	
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println(sc.hashCode());
		loginSystem(sc);

	}

}
