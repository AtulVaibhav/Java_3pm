//Find all pairs of elements from an array whose sum is equal to 
//given number
package com.Arrays.problems;

public class Problem10 {
   public static void getAllPairs(int[] arr,int k){
	   for(int i=0;i<arr.length-1;i++){
		   for(int j=i+1;j<arr.length;j++){
			   if(arr[i]+arr[j]==k){
				  System.out.println(arr[i]+" "+arr[j]);
			   }
		   }
	   }
   }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,5,0,6};
		int key = 6;
		getAllPairs(arr, key);
		

	}

}
