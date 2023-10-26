package com.javaLearning.setter.DI_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new
				ClassPathXmlApplicationContext("com/javaLearning/setter/DI_2/Bean.xml");
		Product product = context.getBean("product",Product.class);
	    System.out.println(product.getProductName());
	    System.out.println(product.getProductDesc());
	    System.out.println(product.getUser().getUserName());
	    context.close();
	    
	}

}
