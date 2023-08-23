package com.problems;

import java.util.Scanner;

public class LoginSystem {
	static String username = "admin";
	static String password = "admin";
	
    public static boolean login(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the username");
    	String username = sc.next();
    	System.out.println("Enter the password");
    	String pass = sc.next();
    	if(username.equals(LoginSystem.username) &&
    			pass.equals(LoginSystem.password)){
    		return true;
    	}	
    	return false;
    }
	public static void main(String[] args) {
		String result = login()?"Login Successfull":"Login Failed";
		System.out.println(result);

	}

}
