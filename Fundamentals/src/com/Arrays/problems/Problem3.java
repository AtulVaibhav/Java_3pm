//Write a program to print count of even numbers
package com.Arrays.problems;

public class Problem3 {
    public static int countOfEven(int[] a){
    	int counter = 0;
    	for(int data:a){
    		if(data%2==0) counter++;
    	}
    	return counter;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(countOfEven(arr));

	}

}
