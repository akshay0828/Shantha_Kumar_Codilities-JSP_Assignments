package com.valtech.spring.tx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.tx.enetites.Tx;
import com.valtech.spring.tx.service.Txservice;

@RestController
public class TxRestControllers {
	
	@Autowired
	private Txservice txservice;

	@PostMapping("/api/Tx")
	public Tx saveTx(@RequestBody Tx tx){
		return txservice.save(tx);
	}
	
	@GetMapping("/api/Tx")
	public List<Tx> getTx(){
		return txservice.findAll();
	}
 
	@GetMapping("/api/Tx/{id}")
 public Tx getCustomer(@PathVariable("id") long id){
		
		return txservice.getById(id);

 }


	
	
}
