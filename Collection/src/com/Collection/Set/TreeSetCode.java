package com.Collection.Set;

import java.util.TreeSet;

//null is not allowed in treeSet:Exception will occur when trying to add null value
public class TreeSetCode {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(20);
		treeSet.add(null);
		
		System.out.println(treeSet);
	}

}
