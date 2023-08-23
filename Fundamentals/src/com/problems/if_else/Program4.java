/*A student will not be allowed to sit in exam if his/her attendence 
 * is less than 75%.
  Take following input from user
  Number of classes held
  Number of classes attended.
  And print percentage of class attended
  Is student is allowed to sit in exam or not.
 * 
 * 
 */


package com.problems.if_else;

import java.util.Scanner;

public class Program4 {
    
	public static void calculatePercentage(int classHeld,int classAttended){
		double percentage = (classAttended*100)/classHeld;
		System.out.println("Percentage = "+percentage/100);
	    if((percentage/100)<0.75){
	    	System.out.println("Not allowed");
	    }else{
	    	System.out.println("Allowed");
	    }
	    
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class held");
        int classHeld = sc.nextInt();
        System.out.println("Enter the class attended");
        int classAttended = sc.nextInt();
        
        calculatePercentage(classHeld, classAttended);
	}

}
