package com.javaLearning.constructor.DI_3;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/javaLearning/constructor/DI_3/Bean.xml");
		Question question = context.getBean("question",Question.class);
        System.out.print(question.getQuestionNumber());
        System.out.print(".");
        System.out.println(question.getQuestion());
//        Iterator<String> answers = question.getAnswers().iterator();
//        while(answers.hasNext()){
//        	System.out.println(answers.next());
//        }
		
		for(Answer ans : question.getAnswers()){
			System.out.print(ans.getId());
			System.out.print(".");
			System.out.println(ans.getAns());
		}
		
		
		
		
	}

}
