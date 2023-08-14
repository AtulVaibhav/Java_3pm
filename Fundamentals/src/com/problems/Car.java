package com.problems;

public class Car {
	Car(){
		System.out.println("default constructor");
	}
	void Car(){
		System.out.println("method called");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.Car();

	}

}
