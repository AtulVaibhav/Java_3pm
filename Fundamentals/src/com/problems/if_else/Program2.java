/*A shop will give discount of 10% if the cost of purchased quantity 
 * is more than 1000.
   Ask user for quantity
   Suppose, one unit will cost 100.
   Judge and print total cost for user.
 * 
 */

package com.problems.if_else;

import java.util.Scanner;

public class Program2 {
    public static double costPrice(int quantity){
    	double totalCost = quantity *100;
    	if(totalCost>1000){
    		totalCost = totalCost - (totalCost*0.1);
    		return totalCost;
    	}
    	return totalCost;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		double cost = Program2.costPrice(quantity);
		System.out.println(cost);
		

	}

}
