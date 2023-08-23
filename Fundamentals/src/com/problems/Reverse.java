package com.problems;

public class Reverse {
    public static int findReverse(int num){
    	int rev = 0;
    	while(num>0){
    		int rem = num%10;
    		num = num/10;
    		rev = rev*10+rem;
    	}
    	return rev;
    }
	public static void main(String[] args) {
		int a = 4567; 
		System.out.println(findReverse(a));
	}

}
