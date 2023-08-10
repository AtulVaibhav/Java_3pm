//Methods:block of statements.

package com.javaFundamentals;

public class Methods {
	//general syntax:
	public void addNumber(int num,int num2){
		System.out.println(num+num2);
	}
	
	public int multiplication(int num,int num2){
		System.out.println(num);
		System.out.println(num2);
		return num*num2;
	}
	
	
	public static void getName(){
		System.out.println("Hello Java");
	}
    
	public static void main(String[] args) {
	 Methods obj = new Methods();
//	 obj.addNumber(1 , 3);
//	 obj.addNumber(21, 12);
	int result = obj.multiplication(11, 12);
     System.out.println(result);
     
     System.out.println(obj.multiplication(2, 2));
	 
     //using classname(static method)
     Methods.getName();
	
	
	}
	
}
