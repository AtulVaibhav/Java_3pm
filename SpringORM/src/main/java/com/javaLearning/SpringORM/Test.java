package com.javaLearning.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
      BookDao bean = context.getBean("bookDao",BookDao.class);
      
      Book book = new Book();
      book.setBookName("Complete Reference:Java");
      book.setBookAuthor("Herbert Schildt");
      
      System.out.println(bean.addBook(book));
      //System.out.println(bean.getById(1));
      
	}

}
