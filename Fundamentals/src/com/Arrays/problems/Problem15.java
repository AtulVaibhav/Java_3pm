//Find missing number in the array.
package com.Arrays.problems;

import java.util.Arrays;

public class Problem15 {
	public static void missingNumber(int[] arr,int n){
		//sum of n natural number : n(n+1)/2
		Arrays.sort(arr);//6,8,9,10 +x
		int totalSum=0;
		int firstNum = arr[0];//6
		int lastNum = arr[n-1];//10
		for(int i=firstNum;i<=lastNum;i++){
			totalSum = totalSum +i;
		}
		int sum=0;
		for(int data:arr){
			sum +=data;
		}
		System.out.println(totalSum - sum);
	}

	public static void main(String[] args) {
		int[] arr = {5,2,3};//15-10 = 5
		
		int[] arr2 = {10,8,9,6};//
		int n = arr.length;
		missingNumber(arr2, n);

	}

}
