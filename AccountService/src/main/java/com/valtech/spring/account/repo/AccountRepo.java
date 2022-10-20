package com.valtech.spring.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.spring.account.entity.Account;

@Repository
public interface AccountRepo  extends JpaRepository<Account, Long>{
	
	

}
