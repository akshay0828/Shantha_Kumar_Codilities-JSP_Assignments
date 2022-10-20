package com.valtech.spring.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.account.entity.Customer;
import com.valtech.spring.account.service.CustomerServiceImpl;


@RestController
public class CustomerRestController {
	@Autowired
	private CustomerServiceImpl customerService;
	
	
	@PostMapping("/api/customer/")
	public Customer save(@RequestBody Customer customer){
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/api/customer/")
	public List<Customer> getCustomer(){
		return customerService.getAllCustomer();
	}
 
	@GetMapping("/api/customer/{id}")
 public Customer getCustomer(@PathVariable("id") long id){
		
		//Address address=addressService.getAddress(id);
		return customerService.getCustomer(id);

 }
	
	@PutMapping("/api/customer/{id}")
    public Customer updateCustomer(@PathVariable("id")int id, @RequestBody Customer customer){

		customer.setId(id);
        return customerService.updateCustomer(customer);
    }

}
