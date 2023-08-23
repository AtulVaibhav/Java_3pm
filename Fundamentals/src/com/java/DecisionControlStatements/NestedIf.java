package com.java.DecisionControlStatements;

public class NestedIf {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		
		if(x>y){
			if(x>z){
				System.out.println("Hello");
			}else{
				System.out.println("Hi");
			}
		}else{
			System.out.println("Java");
		}
	}

}
