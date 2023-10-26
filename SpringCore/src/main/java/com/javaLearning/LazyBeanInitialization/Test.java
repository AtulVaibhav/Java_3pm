package com.javaLearning.LazyBeanInitialization;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/javaLearning/LazyBeanInitialization/Bean.xml");
	 classPathXmlApplicationContext.getBean("B",B.class);
	}

}
