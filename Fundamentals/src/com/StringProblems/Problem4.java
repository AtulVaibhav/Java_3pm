//Given a string str, write a Java program to print all words with even 
//length in the given string.


package com.StringProblems;

public class Problem4 {
	public static void evenWord(String str){
		String result="";
		String[] arr = str.split(" ");
		for(String data:arr){
			if(data.length()%2==0){
				//result = result+" "+data;
				System.out.println(data+" :"+data.length());
			}
		}
		//return result;
	}

	public static void main(String[] args) {
	 String str = "This is a java language";
	// System.out.println(evenWord(str));
    evenWord(str);
	}

}
