package com.valtech.Spring.Boot.New.restcontrollers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.valtech.Spring.Boot.New.entity.Address;
import com.valtech.Spring.Boot.New.entity.Author;
import com.valtech.Spring.Boot.New.entity.Book;
import com.valtech.Spring.Boot.New.entity.Car;
import com.valtech.Spring.Boot.New.service.AddressService;
import com.valtech.Spring.Boot.New.service.AuthorService;
import com.valtech.Spring.Boot.New.service.BookService;
import com.valtech.Spring.Boot.New.service.CarService;







@RestController
public class AuthorRestController {
	@Autowired
	 private AuthorService authorService;
	@Autowired
	 private AddressService addressService;
	@Autowired
	private BookService bookservice;
		
		@PostMapping("/api/author")
		public Author save(@RequestBody Author author){
			ModelAndView view=new ModelAndView("author/list");
		
			//Address a=new Address("mandya2","Blr","Kar",56078);
			//addressService.save(a);
			//Author author1=authorService.save(author);
			//author1.setAddress(a);
			
			Author author1=authorService.save(author);
			Book ac=new Book("book2","22-1-1");
			//Book ac1=new Book("book2","22-1-1");
			author.addBook(ac);
			
			//author1.addBook(ac);
			
			return author1;
			
			
		}
		
		@GetMapping("/api/author")
		public List<Author> getCars(){
			return authorService.getAllAuthors();
		}
	 
		@GetMapping("/api/author/{id}")
	 public Author getAuthor(@PathVariable("id") int id){
			Author author=authorService.getAuthor(id);
			
			return author;

	 }
		
		@PutMapping("/api/author/{id}")
	    public Author updateCar(@PathVariable("id")int id, @RequestBody Author author){

			author.setId(id);
	        return authorService.update(author);
	    }
}
