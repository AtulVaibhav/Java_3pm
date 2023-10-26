package com.javaLearning.setter.DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new
				ClassPathXmlApplicationContext("com/javaLearning/setter/DI/Bean.xml");
		Product product = context.getBean("product",Product.class);
	    System.out.println(product.getProductName());
	    System.out.println(product.getProductDesc());
	    context.close();
	    
	}

}
