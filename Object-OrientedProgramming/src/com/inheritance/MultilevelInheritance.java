package com.inheritance;

class GP{
	int data = 100;
}

class P extends GP{
	int data2 =200;
}

class C extends P{
	int data3 =300;
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		C obj = new C();
		System.out.println(obj.data);
		System.out.println(obj.data2);
		System.out.println(obj.data3);

	}

}
