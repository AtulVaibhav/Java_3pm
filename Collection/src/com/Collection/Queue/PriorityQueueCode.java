package com.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCode {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
		System.out.println(queue.isEmpty());
		//element():
		//System.out.println(queue.element());
		
		//peek()
		System.out.println(queue.peek());
		
		queue.add(3);
		queue.add(1);
		queue.add(2);
		queue.add(4);
		queue.add(6);
		queue.add(5);
		
		for(int i=1;i<=6;i++){
			System.out.println(queue.poll());
		}
		
		
		
		
		
		
		
		
		
		

	}

}
