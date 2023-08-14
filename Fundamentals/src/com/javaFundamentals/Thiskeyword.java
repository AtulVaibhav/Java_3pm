package com.javaFundamentals;


class Shape{
	Shape(){
		System.out.println("Value of this -->"+this.hashCode());
	}
}

public class Thiskeyword {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println("Value of s1 = "+s1.hashCode());
		
		Shape s2 = new Shape();
		System.out.println("Value of s2 = "+s2.hashCode());

	}

}
