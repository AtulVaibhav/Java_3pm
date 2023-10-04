package com.Collection.List;

import java.util.Iterator;
import java.util.LinkedList;

// linkedList = double linkedlist
public class LinkedListCode {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		int count=100;
		for(int i=1;i<=5;i++){
			list.add(count++);
		}
		System.out.println(list);
		list.addFirst(50);
		
		System.out.println(list);
		
		list.add(4, 200);
		System.out.println(list);
		
		list.addLast(500);
		System.out.println(list);
		
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Iterator<Integer>itr2 = list.descendingIterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		
		
		//set
		list.set(2, 202);
		System.out.println(list);
		
		//contains
		System.out.println(list.contains(202));

	}

}
