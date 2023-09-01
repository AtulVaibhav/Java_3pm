//Write a program to print sum of all elements

package com.Arrays.problems;

public class Problem2 {
	public static int sumOfElements(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum + a[i];//12+14+15
		}
//		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int[] arr={12,14,15,10,1};
		int result =sumOfElements(arr);
		System.out.println(result);
	}

}
