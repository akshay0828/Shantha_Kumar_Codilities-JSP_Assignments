package com.valtech.Spring.Boot.New.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.valtech.Spring.Boot.New.entity.Book;
import com.valtech.Spring.Boot.New.service.AuthorService;
import com.valtech.Spring.Boot.New.service.BookService;


@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/library/book/{id}")
	public ModelAndView saveUpdatebook(@PathVariable("id") int id,@ModelAttribute Book book,@RequestParam("submit") String submit){
		ModelAndView view=new ModelAndView("library/list");
		
		
		if(submit.equals("Cancel")){
			view.addObject("library", bookService.getAllBook());
			return view;
		}
		
		
		bookService.updateBook(book);
		view.addObject("library", bookService.getAllBook());
		return view;
	}
	
	@GetMapping("/library/updateBook/{id}")
	public String updatebook(@PathVariable("id") int id,Model model){
		model.addAttribute("library", bookService.getBook(id));
		return "library/list";
	}
	
	@PostMapping("/library/newBook")
	public ModelAndView saveNewBook(@ModelAttribute Book book){
		ModelAndView mvn=new ModelAndView("library/list");
		bookService.saveBook(book);
		mvn.getModel().put("library",authorService.getAllAuthors());
		return mvn;
	}
	
	@GetMapping("/library/newBook")
	public String newBook(){
		return "library/newBook";
	}
	
//	@GetMapping("/library/list")
//	public String list(Model model){
//		System.out.println("List of Authors");
//		model.addAttribute("library", authorService.getAllAuthors());
//
//		
//		return "library/list"; 
//}
}
