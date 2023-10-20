package com.javaLearning.constructor.DI_3;

public class Answer {
	private int id;
	private String ans;

	public Answer(int id, String ans) {
		super();
		this.id = id;
		this.ans = ans;
	}

	public int getId() {
		return id;
	}

	public String getAns() {
		return ans;
	}

}
