package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Book;
import com.valtech.Spring.Boot.New.entity.Publisher;
import com.valtech.Spring.Boot.New.repo.BookRepository;
import com.valtech.Spring.Boot.New.repo.PublisherRepository;



@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class BookServiceImpl implements BookService {
	
	
	@Autowired
	private BookRepository bookReposotory;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Book saveBook(Book book){
		return bookReposotory.save(book);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Book updateBook(Book book){
		return bookReposotory.save(book);
	}
	
	@Override
	public Book getBook(int id){
		return bookReposotory.getReferenceById(id);
	}
	@Override
	public List<Book> getAllBook(){
		return bookReposotory.findAll();

}
}
