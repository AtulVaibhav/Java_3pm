//WAP to replace duplicate if found replace with -1 and print an array
package com.Arrays.problems;

public class Problem8 {
    public static int[] duplicateElement(int[] arr){
    	for(int i=0;i<arr.length-1;i++){
    		for(int j=i+1;j<arr.length;j++){
    			if(arr[i]==arr[j]){
    				arr[j] = -1;
    			}
    		}
    	}
    	return arr;
    }
	public static void main(String[] args) {
		int[] arr = {10,20,10,30,10};
		int[] result = duplicateElement(arr);
		for(int data:result){
			System.out.print(data+" ");
		}

	}

}
