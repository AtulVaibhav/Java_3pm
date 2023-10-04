package com.Collection.Queue;

import java.util.ArrayDeque;

public class ArrayDequeCode {

	public static void main(String[] args) {
		ArrayDeque<Integer> arr = new ArrayDeque<>();
		//getFirst
		//System.out.println(arr.getFirst());
		
		
		//getLast()
		//System.out.println(arr.getLast());
		
		arr.offer(10);
		arr.offer(20);
		System.out.println(arr);
		//addFirst()
		arr.addFirst(5);
		
		System.out.println(arr);
		
		//addLast
		arr.addLast(25);
		System.out.println(arr);
		
		//peekFirst()
		System.out.println(arr.peekFirst());
		
		//peekLast()
		System.out.println(arr.peekLast());
		
		//getFirst():throw exception if deque is empty

	}

}
