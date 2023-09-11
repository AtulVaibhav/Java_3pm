//WAP to find the count of given character in string
package com.StringProblems;

public class Program7 {
   public static void getCount(String str,char key){
	   int count=0;
	   for(int i=0;i<str.length();i++){
		   if(str.charAt(i)==key){
			   count++;
		   }
	   }
	   System.out.println(count);
   }
	public static void main(String[] args) {
		String str = "encyclopedia";
		char key = 'e';
		getCount(str, key);

	}

}
