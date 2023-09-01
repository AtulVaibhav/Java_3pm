package com.java.DecisionControlStatements;

public class BreakStatement {

	public static void main(String[] args) {
		//Loop ,Switch
		//Nested
		for(int i=1;i<=10;i++){
		    for(int j=1;j<=5;j++){
		    	if(j==3){
		    		break;
		    	}
		    	System.out.println("i="+i+" j="+j);//i = 1 2-----10
		    }
		}
		System.out.println("Out of loop");

	}

}
