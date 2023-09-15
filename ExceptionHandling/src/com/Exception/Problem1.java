package com.Exception;

public class Problem1 {
	public static void m1(){
		String str = "Java2EE";
		System.out.println(str.charAt(str.length()));
		try{
			int[] arr = {1,2,3};
			for(int i=0;i<=arr.length;i++){
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Exception handled");
		}
		
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {
		m1();

	}

}
