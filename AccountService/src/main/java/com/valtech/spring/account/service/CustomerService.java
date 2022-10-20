package com.valtech.spring.account.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.account.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer getCustomer(long id);

	List<Customer> getAllCustomer();

}