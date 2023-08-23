package com.java.DecisionControlStatements;
// for(forEach, EnhancedFor)   while do-while
public class Loops {

	public static void main(String[] args) {
		// for:pre-check
		/*
		 * for(initialization; condition; update){}
		 * for(int i=11;i<=10;i++){}
		 * 
		 * 
		 * 
		 * 
		 */
		
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
      
		/*
		 * while :pre-check ; minimum execution:0
		 * 
		 * initialize;
		 * while(condition){
		 * 
		 * updation;
		 * }
		 */
		
		int a = 1;
		while(a<=10){
			System.out.println("Hello");
			a++;
		}
		
		/*do-while : post-check: minimum execution:1
		 * 
		 * initialize
		 * do{
		 *   body of loop
		 *   }while(condition++);
		 * 
		 * 
		 */
		
		int b = 11;
		do{
			System.out.println("Java");
		}while(++b<=10);
		
		
	}

}
