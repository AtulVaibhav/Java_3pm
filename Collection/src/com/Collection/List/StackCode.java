package com.Collection.List;

import java.util.Stack;

public class StackCode {

	public static void main(String[] args) {
		int customSize = 10;
		Stack<Integer> stack = new Stack<>();
		System.out.println(stack.size());
		stack.setSize(customSize);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		//push()
		int count = 100;
		for(int i=1;i<=10;i++){
			stack.push(count++);
		}
		System.out.println(stack);
		
		//pop()
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.size());
		

	}

}
