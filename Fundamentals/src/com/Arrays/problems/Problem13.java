//Separate odd and even numbers in an array
package com.Arrays.problems;

public class Problem13 {
    public static void modifiedArray(int[] arr){
    	int[] temp = new int[arr.length];
    	int count = getCount(arr);
    	int startingIndex = 0;
    	int secondIndex = count;
    	
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]%2==0){
    			temp[startingIndex++] = arr[i];
    		}else{
    			temp[secondIndex++] = arr[i];
    		}
    	}
    	
    	for(int data:temp){
    		System.out.print(data+" ");
    	}
    	
    	
    }
	private static int getCount(int[] arr) {
		int count=0;
		for(int data:arr){
			if(data%2==0) count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8};
		modifiedArray(arr);

	}

}
