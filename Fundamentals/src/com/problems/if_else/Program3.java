/*A company decided to give bonus of 5% to employee if his/her year 
 * of service is more than 5 years.
   Ask user for their salary and year of service and print the net bonus 
   amount.
 * 
 * 
 */


package com.problems.if_else;

import java.util.Scanner;

public class Program3 {
    public static int calculateBonus(int year,int sal){
    	if(year>5) {
    		int bonus = (int)(sal*0.05);
    		return bonus;
    	}
    	return 0;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year of service");
		int yearOfService = sc.nextInt();
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
		int bonusAmount = calculateBonus(yearOfService,salary);
		System.out.println(bonusAmount);

	}

}
