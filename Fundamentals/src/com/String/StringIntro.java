package com.String;

public class StringIntro {

	public static void main(String[] args) {
		//creating string object
		//new--heap 
		//By literals (String constant pool)
//		String str = "Java";
//		System.out.println(str.hashCode());
//		String str2 = "Java";
//		System.out.println(str2.hashCode());
//		String str3="java";
//		System.out.println(str3.hashCode());
//		
//		//String()
//		String obj = new String("Hello");
//		
//		String obj = "Java";
//		String obj2 = obj;
//		obj = null;
//		String obj3 = obj2;
//		System.out.println(obj+" "+obj2+" "+obj3);//null java java
//		
//		//Accessing string object
//		String obj4 = "Hello Java";
//		System.out.println(obj4.charAt(0));
//		char[] arr = obj4.toCharArray();
//		  for(char ch:arr){
//			  System.out.println(ch);
//		  }
		  
		  //Immutable
//		  String obj5 = "J2EE";
//		  System.out.println(obj5);
//		  System.out.println(obj5.hashCode());
//		  obj5 = obj5.concat("EJB");//new String obj in scp
//		  System.out.println(obj5);
//		  System.out.println(obj5.hashCode());
		  
		  //Methods in String
		  //concat()
		String obj6 = "Spring";
		System.out.println(obj6.concat("Boot"));
		
		  //charAt(index)
		for(int i=0;i<6;i++){
			System.out.println(obj6.charAt(i));
		}
		
		//length()
		String obj7 ="SpringBoot" ;
		System.out.println(obj7.length());
		
		//toLowerCase()
		//toUpperCase()
		//indexOf(char)
		System.out.println(obj7.indexOf('o'));
		
		//substring
		System.out.println(obj7.substring(1));
		System.out.println(obj7.substring(1,5));//1-4
		
		//split->String[]
		String obj8 = "Java is a programming language";
		String[] words = obj8.split(" ");
		for(String word:words){
			System.out.println(word);
		}
		
		
		
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
				
	}

}
