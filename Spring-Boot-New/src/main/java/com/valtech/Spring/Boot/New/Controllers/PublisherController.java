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

import com.valtech.Spring.Boot.New.entity.Publisher;
import com.valtech.Spring.Boot.New.service.AuthorService;
import com.valtech.Spring.Boot.New.service.PublisherService;



@Controller
public class PublisherController {
	@Autowired
	private PublisherService publisherService;
	
	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/library/publisher/{id}")
	public ModelAndView saveUpdatepublisher(@PathVariable("id") int id,@ModelAttribute Publisher publisher,@RequestParam("submit") String submit){
		ModelAndView view=new ModelAndView("library/list");
		
		ModelAndView view1=new ModelAndView("library/newPublisher");
		if(submit.equals("Cancel")){
			view.addObject("library", publisherService.getAllPublisher());
			return view;
		}
		
		if(submit.equals("Add_Book")){
			
			return view1;
		}
		
		publisherService.updatePublisher(publisher);
		view.addObject("library", publisherService.getAllPublisher());
		return view1;
	}
	
	@GetMapping("/library/updatePublisher/{id}")
	public String updatepublisher(@PathVariable("id") int id,Model model){
		model.addAttribute("library", publisherService.getPublisher(id));
		return "library/list";
	}
	
	@PostMapping("/library/newPublisher")
	public ModelAndView saveNewpublisher(@ModelAttribute Publisher publisher){
		ModelAndView mvn=new ModelAndView("library/list");
		publisherService.savePublisher(publisher);
		mvn.getModel().put("library", authorService.getAllAuthors());
		return mvn;
	}
	
	@GetMapping("/library/newPublisher")
	public String newpublisher(){
		return "library/newPublisher";
	}
	
//	@GetMapping("/library/list")
//	public String list(Model model){
//		System.out.println("List of publishers");
//		model.addAttribute("library", publisherService.getAllPublisher());
//
//		
//		return "library/list"; 
}

