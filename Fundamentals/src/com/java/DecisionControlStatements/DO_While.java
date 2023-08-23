package com.java.DecisionControlStatements;

import java.util.Scanner;

public class DO_While {
	static char input;
	
    public static void m1(){
    	System.out.println("function executed");
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do{
			m1();
			
		System.out.println("Do you want to continue:");
		input = sc.next().charAt(0);
		}while(input=='y');
     System.out.println("Thanking you");
	}

}
