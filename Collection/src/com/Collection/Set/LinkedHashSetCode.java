package com.Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCode {

	public static void main(String[] args) {
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(40);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(20);
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);

	}

}
