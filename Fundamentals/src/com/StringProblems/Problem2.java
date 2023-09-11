//WAP to convert String to UpperCase without using toUpperCase()
package com.StringProblems;

public class Problem2 {
    public static void getUpperCase(String str){
    	String str2 ="";
    	for(int i=0;i<str.length();i++){
    		char ch = str.charAt(i);
    		int num = ch-32;
    		char newChar = (char)num;
    		str2 = str2+newChar;
    	}
    	System.out.println(str2);
    }
	public static void main(String[] args) {
		String str = "encyclopedia";
		getUpperCase(str);
	}

}
