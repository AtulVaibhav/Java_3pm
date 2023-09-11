package com.inheritance;

class Vehicle{
	String color="Black";
	public void show(){
		System.out.println(color);
	}
}
class Four_Wheeler extends Vehicle{
	int wheels = 4;
	public void display(){
		System.out.println(wheels);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Four_Wheeler Santro = new Four_Wheeler();
		Santro.show();
		Santro.display();

	}

}
