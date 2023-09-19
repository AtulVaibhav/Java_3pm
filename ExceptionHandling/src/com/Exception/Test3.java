//finally:code present inside finally block will execute even if exception is handled or not
package com.Exception;

public class Test3 {
	public static void m1(){
		System.out.println("stat1");
		try{
		int result = 12/0;//exception occurred here
		}finally{
			System.out.println("stat2");
			System.out.println("stat3");
			System.out.println("stat4");
		}
		
		
//		}catch(Exception e){
//			System.out.println("Exception handled");
//		}
		
	}

	public static void main(String[] args) {
		m1();

	}

}
