//WAP to find the sum of all odd numbers
package com.Arrays.problems;

public class Problem4 {
    public static int sumOfOdd(int[] arr){
    	int sum=0;
    	for(int data:arr){
    		if(data%2==1) sum += data;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
       System.out.println( sumOfOdd(arr));
	}

}
