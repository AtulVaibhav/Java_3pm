package com.javaFundamentals;

public class Query {
	int data = 10;
	static int data2 = 100;
	
//	public void showData(){
//	System.out.println(Query.data2);
//	System.out.println(data);
//	}
	
	public static void showData(){
		System.out.println(Query.data2);
		//System.out.println(data);
		}

	public static void main(String[] args) {
		Query q = new Query();
		//q.showData();
		Query.showData();
	}

}
