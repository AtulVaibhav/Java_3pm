//WAP to find length of string without using length()
package com.StringProblems;

public class Problem1 {
    public static void getLength(String str){
    	char[] letters = str.toCharArray();
    	int count=0;
    	for(char ch :letters){
    		count++;
    	}
    	System.out.println(count);
    }
	public static void main(String[] args) {
		String str = "encyclopedia";
		getLength(str);

	}

}
