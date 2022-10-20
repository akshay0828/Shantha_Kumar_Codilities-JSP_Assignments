package com.valtech.spring.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.valtech.spring.account.entity.Customer;
import com.valtech.spring.account.repo.CustomerRepo;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo cutomerRepo;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Customer createCustomer(Customer customer){
		return cutomerRepo.save(customer);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Customer updateCustomer(Customer customer){
		return cutomerRepo.save(customer);
	}
	
	@Override
	public Customer getCustomer(long id){
		return cutomerRepo.findById(id).get();
	}
	@Override
	public List<Customer> getAllCustomer(){
		return cutomerRepo.findAll();
	}

}
