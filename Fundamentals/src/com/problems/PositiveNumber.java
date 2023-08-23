package com.problems;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		int data=0;
		int sum=0;
		int count=-1;
		Scanner sc = new Scanner(System.in);
		do{ 
			
			//sum = sum+data;
			count++;
			System.out.println("Enter the number");
			data = sc.nextInt();
		}while(data>0);
		//System.out.println("Sum :"+sum);
		System.out.println(count);

	}

}
