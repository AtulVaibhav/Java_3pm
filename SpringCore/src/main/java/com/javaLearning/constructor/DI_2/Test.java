package com.javaLearning.constructor.DI_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new
				  ClassPathXmlApplicationContext("com/javaLearning/constructor/DI_2/Bean.xml");
        Student s = context.getBean("student",Student.class);
        System.out.println(s);
	}

}
