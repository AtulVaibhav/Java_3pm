//Take two int values from user and print greatest among them.

package com.problems.if_else;

import java.util.Scanner;

public class Program1 {
    public static int greaterNumber(int a, int b){
//    	if(a>b){
//    		System.out.println(a+" is greater");
//    	}else{
//    		System.out.println(b+" is greater");
//    	}
    	
    	if(a>b) return a;
    	return b;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number and second number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = Program1.greaterNumber(a,b);
		System.out.println(result+" is greater");
				

	}

}
