//WAP to reverse each word in given string without changing the position
package com.StringProblems;

public class Problem10 {
	public static void reverseWord(String str){
		String[] arr = str.split(" ");
		String str2=" ";
		for(String data:arr){
			str2 = str2+" " +reverse(data);
		}
		
		System.out.println(str2);
	}

	private static String reverse(String data) {
		StringBuffer sb = new StringBuffer(data);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "Java is a programming language";
		reverseWord(str);

	}

}
