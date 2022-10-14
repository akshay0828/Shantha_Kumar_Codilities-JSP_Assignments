package com.valtech.Spring.Boot.New.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.Spring.Boot.New.entity.Book;
import com.valtech.Spring.Boot.New.entity.Publisher;
import com.valtech.Spring.Boot.New.service.BookService;
import com.valtech.Spring.Boot.New.service.PublisherService;

@RestController
public class BookRestController {
	
	@Autowired
	 private BookService bookService;
		
		@PostMapping("/api/book")
		public Book save(@RequestBody Book book){
			return bookService.saveBook(book);
		}
		
		@GetMapping("/api/book")
		public List<Book> getPublisher(){
			return bookService.getAllBook();
		}
	 
		@GetMapping("/api/book/{id}")
	 public Book getPublisher(@PathVariable("id") int id){
			Book book=bookService.getBook(id);
			return book;

	 }
		
		@PutMapping("/api/book/{id}")
	    public Book updateBook(@PathVariable("id")int id, @RequestBody Book book){
  
			
	        return bookService.updateBook(book);
	    }

}
