//WAP to remove given character from string
package com.StringProblems;

public class Problem8 {
   public static void removeCharacter(String str,char ch){
	   StringBuffer sb = new StringBuffer();
	   for(int i=0;i<str.length();i++){
		   if(str.charAt(i)!=ch){
			   sb.append(str.charAt(i));
		   }
	   }
	   System.out.println(sb);
   }
	public static void main(String[] args) {
		String str = "wikipedia";
		char ch ='i';
		removeCharacter(str, ch);

	}

}
