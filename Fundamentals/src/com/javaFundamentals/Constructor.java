package com.javaFundamentals;

public class Constructor {
    Constructor(){
        this("abc");
    	System.out.println("Default constructor");
    }
    
    Constructor(int a){
    	this();
    	System.out.println("Parameterized constructor");
    }
    
    Constructor(String a){
    	System.out.println("Hello");
    }
	public static void main(String[] args) {
		 Constructor c = new Constructor(10);

	}
  
}







