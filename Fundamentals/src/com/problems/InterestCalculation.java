
//WAP to calculate SI 
package com.problems;

public class InterestCalculation {
	int principle;
	int time;
	float rateOfInterest;
	
	public InterestCalculation(int principle,int time,float rateOfInterest){
		this.principle = principle;
		this.time = time;
		this.rateOfInterest = rateOfInterest;
	}
	
	public float calculateSI(){
		return (this.principle*this.time*this.rateOfInterest)/100;
	}

	public static void main(String[] args) {
		InterestCalculation obj = new InterestCalculation(1000, 2,1.5f);
		float result = obj.calculateSI();
		System.out.println("SI = "+result);
	}

}
