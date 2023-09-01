package com.Arrays;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		//syntax:
		//dataType[][] nameOfArray = {{},{},{}}
		//dataType[][] nameOf Array = new datatype[no.of rows][no.of columns];
		//create an array:1
		
		//Jagged Array example: Array with unequal columns
		int[][] arr = {
				{1,2,3},
				{4,5},
				{7,8,9},	
				{10}
		};
		
		int [][]arr2 = new int[3][3];
		
		//access the elements of a 2D array
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
