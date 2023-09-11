//WAP a java program to check whether string objects are anagram
package com.StringProblems;

public class Problem3 {
	public static boolean isAnagram(String str,String str2){
		boolean flag = false;
		if(str.length()!=str2.length()) return flag;
		if(sort(str).equals(sort(str2))){ 
			flag= true;
			return flag;
		}
		
		return flag;
	}
	private static String sort(String obj){
		char temp;
		char[] arr = obj.toCharArray();
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		}
		String result="";
		for(char ch:arr){
			result +=ch;
		}
		return result;
		
	}

	public static void main(String[] args) {
		String str = "java";
		String str2 = "avjav";
		System.out.println(isAnagram(str, str2));

	}

}
