package com.java.DecisionControlStatements;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i%2==1){
				continue;//skip the iteration
			}
			System.out.println(i);
		}

	}

}
