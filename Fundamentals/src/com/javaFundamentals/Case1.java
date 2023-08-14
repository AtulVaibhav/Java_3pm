package com.javaFundamentals;

class Car{
	int numberOfWheels;
	String carName;
	String carColor;
	
	Car(int numberOfWheels,String carName,String carColor){
		this.numberOfWheels = numberOfWheels;
		this.carName = carName;
		this.carColor = carColor;
	}
	
	public void display(){
		System.out.println(numberOfWheels+ " "+carName+" "+carColor);
	}
	
	
}


public class Case1 {

	public static void main(String[] args) {
		Car santro = new Car(4,"Santro","Black");
		santro.display();

	}

}
