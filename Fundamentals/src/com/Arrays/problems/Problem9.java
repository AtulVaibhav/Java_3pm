//WAP to find a pair whose sum is equals to k.
package com.Arrays.problems;

class Data{
	int startingIndex;
	int endingIndex;
}
public class Problem9 {
   public static Data getPair(int[] arr,int k){
	   Data data = new Data();
	   for(int i=0;i<arr.length-1;i++){
		   for(int j=i+1;j<arr.length;j++){
			   if(arr[i]+arr[j]==k){
				   data.startingIndex = i;
				   data.endingIndex = j;
			   }
		   }
	   }
	   return data;
   }
	public static void main(String[] args) {
		int[] arr = {2,3,10,5,4};
		int k=6;
		Data data = getPair(arr,k);
		System.out.println(data.startingIndex+" "+data.endingIndex);
	}

}
