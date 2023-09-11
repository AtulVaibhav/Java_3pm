//WAP to find the count of words in string
package com.StringProblems;

public class Problem9 {
   public static void wordCount(String str){
	   String[] arr = str.split(" ");
	   System.out.println(arr.length);
   }
	public static void main(String[] args) {
		String str = "Java is a programming language";
        wordCount(str);
	}

}
