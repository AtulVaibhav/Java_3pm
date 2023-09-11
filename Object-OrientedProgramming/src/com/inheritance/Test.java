package com.inheritance;

//is-a relationship

class Parent{
	int data = 100;
}

class Child extends Parent{
	int data2  =200;
}

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.data);
		Child ch = new Child();
		System.out.println(ch.data);
		//Parent p1 = new Parent();
		//System.out.println(p1.data2);
		Child ch2 = new Child();
		System.out.println(ch2.data2);

	}

}
