package com.javaFundamentals;

public class Case2 {
	int a = 100;//instance
	
	public void display(){
	  	System.out.println(this.a);
	}
	
	public void caller(){
		this.display();
	}

	public static void main(String[] args) {
		
        Case2 obj = new Case2();
        obj.caller();
	}

}
