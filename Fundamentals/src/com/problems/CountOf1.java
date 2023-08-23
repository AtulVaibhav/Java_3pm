package com.problems;

public class CountOf1 {
    public static int count(int num){
    	int count = 0;
    	while(num>0){
    		int rem = num%10;
    		if(rem==1) count++;
    		num = num/10;
    		
    	}
    	return count;
    }
	public static void main(String[] args) {
		int num = 1121314;
      System.out.println(count(num));
	}

}
