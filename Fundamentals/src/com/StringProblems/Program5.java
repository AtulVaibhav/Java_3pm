//WAP to check String is palindrome
package com.StringProblems;

public class Program5 {
	public static boolean isPalindrome(String str){
		String temp = "";
		boolean flag =false;
		for(int i=str.length()-1;i>=0;i--){
			temp += str.charAt(i);
		}
		if(str.equals(temp)){
			flag=true;
			return flag;
		}
		return flag;
	}

	public static void main(String[] args) {
		String str = "ababaa";
		System.out.println(isPalindrome(str));

	}

}
