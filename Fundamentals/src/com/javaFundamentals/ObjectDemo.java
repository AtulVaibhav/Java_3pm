package com.javaFundamentals;

public class ObjectDemo {
	 static int data;
	static{
		data = 100;
		System.out.println("static block executed");
	}
	ObjectDemo(){
		
		System.out.println("constructor executed");
	}
    
	{
		System.out.println("block executed");
	}
	public static void main(String[] args) {
		ObjectDemo demo = new ObjectDemo();
		//ObjectDemo demo2 = new ObjectDemo();
	}

}
