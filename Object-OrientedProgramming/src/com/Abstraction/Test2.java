package com.Abstraction;

interface MyInterface{
	void m1();
	public default void m2(){
		System.out.println("Hello m2()");
	}
	
	public static void m3(){
		System.out.println("Hello m3()");
	}
	
}

class MyInterfaceImpl implements MyInterface{

	@Override
	public void m1() {
		System.out.println("Hello m1()");
	}
	
}


public class Test2 {

	public static void main(String[] args) {
		MyInterface objRef = new MyInterfaceImpl();
        objRef.m1();
        objRef.m2();
        MyInterface.m3();
      
        
	}

}
