package com.valtech.spring.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.spring.account.entity.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
