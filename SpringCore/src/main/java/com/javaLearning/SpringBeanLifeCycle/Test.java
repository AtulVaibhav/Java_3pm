package com.javaLearning.SpringBeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new 
				ClassPathXmlApplicationContext("com/javaLearning/SpringBeanLifeCycle/Bean.xml");
		System.out.println("context is created");
		Product p = context.getBean("product",Product.class);
		System.out.println(p.getProductName());
		context.close();
		System.out.println("Program terminated");
	}

}
