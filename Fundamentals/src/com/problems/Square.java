package com.problems;

public class Square {
    public int squareNumber(int a){
    	return a*a;
    }
	public static void main(String[] args) {
		Square sq = new Square();
		int result = sq.squareNumber(12);
		System.out.println(result);
	}
}
