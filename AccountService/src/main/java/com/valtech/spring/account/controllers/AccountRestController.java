package com.valtech.spring.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.account.entity.Account;
import com.valtech.spring.account.service.AccountService;

@RestController
public class AccountRestController {
	
	@Autowired
	private AccountService accountService;
	
	
	@PostMapping("/api/accounts/SB/")
public Account createSavingAccount(@RequestParam("balance") double balance){
	return accountService.createSavingAccount(balance);
}
	@PostMapping("/api/accounts/CB/")
public Account createCurrentAccount(@RequestParam("balance") double balance){
		return accountService.createCurrentAccount(balance);
}
	
	@PostMapping("/api/accounts/")
	public Account createAccount(@RequestBody Account account){
		return accountService.createAccount(account);
	}
	@GetMapping("/api/accounts/")
	public List<Account> list(){
		return accountService.getAllAccount();
	}
}
