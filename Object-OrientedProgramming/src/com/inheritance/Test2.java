package com.inheritance;

class A{
	//int data = 100;
	A(int a){
		System.out.println("Calling from Parent class");
	}
}

class B extends A{
//	int data = 200;
//	public void show(){
//		System.out.println(super.data);
	
	B(){
		 
		super(10);
	
		System.out.println("Calling from Child class");
	  }
	
	
	
	}
	
public class Test2 {

	public static void main(String[] args) {
		B b = new B();
		//A a = new A();
		//System.out.println(b.data);
//        b.show();
	}

}
