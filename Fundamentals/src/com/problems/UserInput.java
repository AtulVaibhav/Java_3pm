package com.problems;

import java.util.Scanner;

public class UserInput {
	int principle;
	int time;
	float rateOfInterest;
	
	public UserInput(int principle,int time,float rateOfInterest){
		this.principle = principle;
		this.time = time;
		this.rateOfInterest = rateOfInterest;
	}
	
	public float calculateSI(){
		return (this.principle*this.time*this.rateOfInterest)/100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int principle = sc.nextInt();
		System.out.println("Enter the time");
		int time = sc.nextInt();
		System.out.println("Enter the rateOfInterest");
		float roi = sc.nextFloat();
		
		UserInput obj = new UserInput(principle,time,roi);
		float result = obj.calculateSI();
		System.out.println("SI = "+result);
	}

}
