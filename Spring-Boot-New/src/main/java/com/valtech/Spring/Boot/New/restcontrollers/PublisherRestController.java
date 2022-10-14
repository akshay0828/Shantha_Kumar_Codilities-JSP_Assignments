package com.valtech.Spring.Boot.New.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.Spring.Boot.New.entity.Address;
import com.valtech.Spring.Boot.New.entity.Publisher;
import com.valtech.Spring.Boot.New.service.AddressService;
import com.valtech.Spring.Boot.New.service.PublisherService;


@RestController
public class PublisherRestController {

	@Autowired
	 private PublisherService publisherService;
		
		@PostMapping("/api/publisher")
		public Publisher save(@RequestBody Publisher publisher){
			return publisherService.savePublisher(publisher);
		}
		
		@GetMapping("/api/publisher")
		public List<Publisher> getPublisher(){
			return publisherService.getAllPublisher();
		}
	 
		@GetMapping("/api/publisher/{id}")
	 public Publisher getPublisher(@PathVariable("id") int id){
			Publisher author=publisherService.getPublisher(id);
			return author;

	 }
		
		@PutMapping("/api/publisher/{id}")
	    public Publisher updatePublisher(@PathVariable("id")int id, @RequestBody Publisher publisher){
   
			publisher.setId(id);
	        return publisherService.updatePublisher(publisher);
	    }
	
}
