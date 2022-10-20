package com.valtech.spring.account.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.account.entity.Account;
@Service
public interface AccountService {

	Account createAccount(Account account);

	Account updateAccount(Account account);

	Account getAccount(long id);

	List<Account> getAllAccount();

	Account createSavingAccount(double bal);

	Account createCurrentAccount(double bal);

}