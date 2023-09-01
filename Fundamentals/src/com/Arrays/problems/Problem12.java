// Given an array of 0’s and 1’s in random order, 
//you need to separate 0’s and 1’s in an array.
package com.Arrays.problems;

public class Problem12 {
    private static int getCount(int[] arr){
    	int count=0;
    	for(int data:arr){
    		if(data==0)count++;
    	}
    	return count;
    }
    
    public static void arrange01(int[] arr){
    	int zeros = getCount(arr);
    	for(int i=0;i<zeros;i++){
    		arr[i] = 0;
    	}
    	for(int i=zeros;i<arr.length;i++){
    		arr[i] = 1;
    	}
    	
    	for(int data :arr){
    		System.out.print(data+" ");
    	}
    }
    
    
	public static void main(String[] args) {
		int[] arr={1,0,0,1,1,0,1,1,0,0,0,1,1};
		arrange01(arr);
   
	}

}
