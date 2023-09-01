//WAP to search an element and return index if found,otherwise return
// -1
package com.Arrays.problems;

public class Problem7 {
	public static int searchElement(int[]arr,int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){ 
				return i;    
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr={200,2,3,21,34,23,56,78,105};
		int key = 105;
		System.out.println(searchElement(arr, key));

	}

}
