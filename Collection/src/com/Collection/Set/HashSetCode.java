package com.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCode {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		//set.add(10);
		set.add(40);
		set.add(null);
		
		System.out.println(set);
		
		//access elements from set
		Integer[] arr = new Integer[set.size()];
		set.toArray(arr);
		for(Integer data : arr){
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println(arr[1]);
		
		//Iterating through set
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//remove
		System.out.println(set.remove(40));
		
		System.out.println(set);
		
		System.out.println(set.remove(120));
		
		
		//union
		Set<Integer> a = new HashSet<>();
		int count=100;
		for(int i=1;i<=5;i++){
			a.add(count++);
		}
		System.out.println(a);
		
        Set<Integer> b = new HashSet<>();
        int countb = 200;
        for(int i=1;i<=5;i++){
			b.add(countb++);
		}
        System.out.println(b);
        
        a.addAll(b);
        System.out.println(a);
        
        //intersection
        Set<Integer> c = new HashSet<>();
        c.add(101);
        c.add(200);
        c.add(103);
        c.add(203);
        System.out.println(c);
        a.retainAll(c);
        System.out.println(a);
        
        
        //difference: A-B
        Set<Integer> x = new HashSet<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        Set<Integer> y = new HashSet<>();
        y.add(11);
        y.add(2);
        y.add(13);
        y.add(4);
        
        System.out.println(x);
        System.out.println(y);
        x.removeAll(y);
        System.out.println(x);
        
	}

}
