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

import com.valtech.Spring.Boot.New.entity.Author;
import com.valtech.Spring.Boot.New.entity.Car;
import com.valtech.Spring.Boot.New.service.AuthorService;
import com.valtech.Spring.Boot.New.service.CarService;



@Controller
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/library/author/{id}")
	public ModelAndView saveUpdateAuthor(@PathVariable("id") int id,@ModelAttribute Author author,@RequestParam("submit") String submit){
		ModelAndView view=new ModelAndView("library/list");
		
		ModelAndView view1=new ModelAndView("library/newBook");
		if(submit.equals("Cancel")){
			view.addObject("library", authorService.getAllAuthors());
			return view;
		}
		
		if(submit.equals("Add_Book")){
			
			return view1;
		}
		
		authorService.update(author);
		view.addObject("library", authorService.getAllAuthors());
		return view1;
	}
	
	@GetMapping("/library/updateAuthor/{id}")
	public String updateAuthor(@PathVariable("id") int id,Model model){
		model.addAttribute("library", authorService.getAuthor(id));
		return "library/list";
	}
	
	@PostMapping("/library/newAuthor")
	public ModelAndView saveNewAuthor(@ModelAttribute Author author){
		ModelAndView mvn=new ModelAndView("library/newAuthor");
		authorService.save(author);
		mvn.getModel().put("library", authorService.getAllAuthors());
		return mvn;
	}
	
	@GetMapping("/library/newAuthor")
	public String newAuthor(){
		return "library/newAuthor";
	}
	
	@GetMapping("/library/list")
	public String list(Model model){
		System.out.println("List of Authors");
		model.addAttribute("library", authorService.getAllAuthors());

		
		return "library/list"; 
}
	
	
}
