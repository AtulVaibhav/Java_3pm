package com.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//arrayList = dynamic array
public class ArrayListCode {

	public static void main(String[] args) {
		//Collection works object
		
		List<Integer> list = new ArrayList<>();
		//size()
		System.out.println(list.size());
		
		//add the object:add()
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.size());
		//print
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		List<Integer> list2 = new ArrayList<>();
		int count = 100;
		for(int i=1;i<=5;i++){
			list2.add(count++);
		}
		System.out.println(list2);
		
		//addAll()
		list.addAll(list2);
		System.out.println(list);
		
		//get()
		System.out.println(list.get(1));
		
		//set()
		list.set(2, 1000);
		System.out.println(list);
		
		
		//indexOf
		System.out.println(list.indexOf(2000));
		
		//contain
		if(list.contains(2000)){
			System.out.println(list.indexOf(2000));
		}else{
			System.out.println("Element not present");
		}
       
		//remove
		System.out.println(list.remove(2));
		
		
		//to make arrayList thread-safe
		
		Collections.synchronizedList(new ArrayList<>());
		
		
	}

}
