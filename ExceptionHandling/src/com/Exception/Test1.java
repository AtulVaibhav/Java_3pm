//Exception Handling: process to handle exception : try-catch
//finally , throw, throws


package com.Exception;

public class Test1 {
	// use of try block :risky code
	//catch : handle exception : only those exception present inside try block
	
	public static void m1(){
		try{
			//int result = 12/0;//ArithmeticException
			String str = null;
			System.out.println(str.length());//NullPointerException
//		}catch(ArithmeticException ae){
//			System.out.println("Exception handled");
//		}
		}catch(Exception e){
			System.out.println("Exception handled");
		}
		System.out.println("Out of try-catch");
	}

	public static void main(String[] args) {
		m1();

	}

}
