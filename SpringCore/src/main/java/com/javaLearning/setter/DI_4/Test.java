package com.javaLearning.setter.DI_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/javaLearning/setter/DI_4/Bean.xml");
		Category category = context.getBean("category", Category.class);
		System.out.println(category.getCategoryName());
		System.out.println("List of products:");
		for (Product product : category.getListOfProdcuts()) {
			System.out.println(product.getProductName()+"-"+product.getProductDesc());
		}
		context.close();

	}

}
