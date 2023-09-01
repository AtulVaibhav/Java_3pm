package com.Arrays.problems;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:-");
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		System.out.println("Enter the name :-");
		for(int i=0;i<size;i++){
			arr[i] = sc.next();
		}
		for(String name:arr){
			System.out.print(name+" ");
		}
		
		

	}

}
