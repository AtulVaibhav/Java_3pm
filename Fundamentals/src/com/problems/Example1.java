 package com.problems;

public class Example1 {
    int a ;
    
    Example1(){
    	a = 30;
    }
    
    public void show(){
    	
    	System.out.println(a);
    	int a = 20;
    	System.out.println(a);
    }
    
	public static void main(String[] args) {
		Example1 eg = new Example1();
		eg.show();

	}

}
