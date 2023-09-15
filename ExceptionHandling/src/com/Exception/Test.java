package com.Exception;

public class Test {
   public static void m1(){
	  //int result2 = 12/0;//unchecked
	    
	   //ClassNotFoundException
	 //  Class.forName("com.mysql.jdbc.Driver");//checked exception
	   System.out.println("statement 2");
	   System.out.println("statement 3");
   }
   
   //NuberFormatException - uncheckedException
   public static void m2(){
	   String str = "123";
	   String str1 = "123efg";
	   
	   System.out.println(Integer.parseInt(str1));
   }
   
   //ArithmeticException
   public static void m3(){
	   int result = (14*34)/0;
	   System.out.println(result);
   }
   
   //NullPointerException
   public static void m4(){
	   String str = null;
	   System.out.println(str.length());
   }
   
   //ArrayIndexOutOfBoundsException
   public static void m5(){
	   int[] arr = {1,2,3,4,5}; //5: 0-4
	   for(int i=0;i<=arr.length;i++){
			   System.out.println(arr[i]*2);
	   }
   }
   
   //StringIndexOutOfBoundsException
   public static void m6(){
	   String str = "Java";//4 : 0-3
	   for(int i=0;i<=str.length();i++){
		   System.out.println(str.charAt(i));
	   }
   }
   
	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();

	}

}
