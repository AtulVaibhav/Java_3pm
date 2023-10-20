package com.javaLearning.constructor.DI_3;

import java.util.List;

public class Question {
	private int questionNumber;
	private String question;
	private List<Answer> answers;
//	private List<String> answers;
//   
//	public Question(int questionNumber, String question, List<String> answers) {
//		super();
//		this.questionNumber = questionNumber;
//		this.question = question;
//		this.answers = answers;
//	}

	public Question(int questionNumber, String question, List<Answer> answers) {
	super();
	this.questionNumber = questionNumber;
	this.question = question;
	this.answers = answers;
}
	
	
	public int getQuestionNumber() {
		return questionNumber;
	}



	public String getQuestion() {
		return question;
	}


	public List<Answer> getAnswers() {
		return answers;
	}
	
	

	
}
