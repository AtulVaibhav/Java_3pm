//WAP to split the String into a number of substrings.
package com.StringProblems;

public class Problem6 {
   public static void getSubString(String str){
	   for(int i=0;i<str.length();i++){
		   String data="";
		   for(int j=i;j<str.length();j++){
			   data +=str.charAt(j);
			   System.out.print(data+" ");
		   }
	   }
   }
	public static void main(String[] args) {
		String str = "bat";//b a t ba bat at
        getSubString(str);
	}

}
