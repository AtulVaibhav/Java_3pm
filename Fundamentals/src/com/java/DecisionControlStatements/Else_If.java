// 80<=Distinction
//   60 - 79 = First class
//	35 - 59 = Second class
//	35> 


package com.java.DecisionControlStatements;

public class Else_If {

	public static void main(String[] args) {
		int totalMarks = 65;
		if(totalMarks>=80){
			System.out.println("Distinction");
		}else if(totalMarks>=60 && totalMarks<80){
			System.out.println("First class");
			
		}else if(totalMarks>=35 && totalMarks<60){
			System.out.println("Second class");
		}else{
			System.out.println("Come next year");
		}

	}

}
