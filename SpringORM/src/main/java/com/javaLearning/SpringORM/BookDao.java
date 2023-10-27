package com.javaLearning.SpringORM;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class BookDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// create
	
	@Transactional
	public String addBook(Book book){
		this.hibernateTemplate.save(book);
		return "Book saved successfully";
	}
	
	//getById
	 public Book getById(int id){
		Book book =  this.hibernateTemplate.get(Book.class, id);
		if(book==null){
			return null;
		}
		return book;
	 }
	
	//getAll
	 public List<Book> getAll(){
		 return this.hibernateTemplate.loadAll(Book.class);
	 }
	
	
	//update
	 @Transactional
	public String updateBook(Book book, int id){
		Book savedBook = this.hibernateTemplate.get(Book.class, id);
	    if(savedBook==null){
	    	return "Book not found";
	    }
	    
	    savedBook.setBookName(book.getBookName());
	    savedBook.setBookAuthor(book.getBookAuthor());
	    this.hibernateTemplate.save(savedBook);
	    return "Book updated successfully";
	
	}
	
	
	//delete
	 @Transactional
	public String deleteById(int id){
		Book savedBook = this.hibernateTemplate.get(Book.class, id);
		if(savedBook==null){
			return "No book found with id:"+id;
		}
		this.hibernateTemplate.delete(savedBook);
		return "Book deleted successfully";
		
		
	}

}
