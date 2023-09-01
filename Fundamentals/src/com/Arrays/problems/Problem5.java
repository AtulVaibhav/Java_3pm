//WAP to find the index of largest number from an array

package com.Arrays.problems;

public class Problem5 {
    public static int getLargestIndex(int[] arr){
    	int largestElement = arr[0];
    	int position = 0;
    	for(int i=1;i<arr.length;i++){
    		if(largestElement<arr[i]){
    			largestElement = arr[i];
    			position = i;
    		}
    	}
    	return position;
    }
	public static void main(String[] args) {
		int[] arr={200,2,3,21,34,23,56,78,105};
		System.out.println(getLargestIndex(arr));

	}

}
