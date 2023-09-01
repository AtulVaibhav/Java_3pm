//WAP to sort an array in ascending as well as descending order without using
// sorting algorithm.
package com.Arrays.problems;

public class Problem11 {
    public static void ascendingOrder(int[] arr){
    	int temp=0;
    	for(int i=0;i<arr.length-1;i++){
    		for(int j=i+1;j<arr.length;j++){
    			if(arr[i]>arr[j]){
        			temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
    		}
    	}
    	for(int data:arr){
    		System.out.print(data+" ");
    	}
    }
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,10,5,0,6};
		ascendingOrder(arr);

	}

}
