//single try - multiple catch

package com.Exception;

public class Test2 {
	public static void m1(){
		try{
			String str = "Java2EE";
			System.out.println(str.charAt(str.length()));
			
			int[] arr = {1,2,3};
			for(int i=0;i<=arr.length;i++){
				System.out.println(arr[i]);
			}
		}catch(ArithmeticException ae){
			System.out.println("Exception handled by 1st catch block");
		}catch(NullPointerException npe){
			System.out.println("Exception handled by 2nd catch block");
		}catch(Exception e){
			System.out.println("Exception handled by 3rd catch block");
		}
		
		System.out.println("Outside single try -multiple catch block");
	}

	public static void main(String[] args) {
		m1();

	}

}
