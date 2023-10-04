package com.Collection.List;

import java.util.Vector;

// vector = dynamic array
//vector class is thread safe
public class VectorCode {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(12);
		vector.add(20);
		vector.add(1);
		vector.add(20);
		
		System.out.println(vector);

	}

}
