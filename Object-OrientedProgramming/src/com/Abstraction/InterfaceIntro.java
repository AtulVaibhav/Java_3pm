package com.Abstraction;
//inside interface all methods are abstract by default
//inside interface all methods are public by default
//we can't instantiate an interface
//interfaces always need to be implemented


// all variables are static by default
// all variables are public by default
//all variables are final by default
interface M1{
	int a=200;
	void m1();
}

class Child implements M1{
  public  final int data = 1000;
	@Override
	public void m1() {
		System.out.println("abstract method m1() implemented inside child class");
		
	}
	
}

public class InterfaceIntro {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1();
		//ch.data = 2000;
		System.out.println(M1.a);
		//M1.a = 300;

	}

}
