package com.valtech.spring.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.account.entity.Account;
import com.valtech.spring.account.repo.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService  {
	@Autowired
	private AccountRepo accountRepo;
	
	//@Autowired
	private Account account;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Account createAccount(Account account){
		return accountRepo.save(account);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Account updateAccount(Account account){
		return accountRepo.save(account);
	}
	
	@Override
	public Account getAccount(long id){
		return accountRepo.findById(id).get();
	}
	@Override
	public List<Account> getAllAccount(){
		return accountRepo.findAll();
	}
	
	
	
    @Override
	public Account createSavingAccount(double bal){
    	
        //account.setAccountType(Account.SAVINGS);
        account=new Account(Account.SAVINGS,bal);
        return accountRepo.save(account);
    }



    @Override
	public Account createCurrentAccount(double bal) {
    	
    	account=new Account(Account.CURRENT,bal);
        return accountRepo.save(account);
    }
	
}
	
	


