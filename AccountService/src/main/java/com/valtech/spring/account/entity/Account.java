package com.valtech.spring.account.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Account {
	
	public static final String SAVINGS="SB";
	public static final String CURRENT="CB";
	
	@ManyToMany(targetEntity=Customer.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private Set<Customer> customer;
	@JoinTable(name="Customer_Account",joinColumns=@JoinColumn(name="Customer_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="Account_id",referencedColumnName="id"))
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String accountType;
	private double balance;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdatedDate;
	private boolean account;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Account(long id, String accountType, double balance, LocalDateTime creationDate, LocalDateTime lastUpdatedDate,boolean account) {
		this.id = id;
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.account = account;
	}



	public Account(String accountType, double balance) {
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = LocalDateTime.now();
		this.lastUpdatedDate = LocalDateTime.now();
		this.account = false;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public boolean isAccount() {
		return account;
	}
	public void setAccount(boolean account) {
		this.account = account;
	}



	public Set<Customer> getCustomer() {
		return customer;
	}



	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}



	public static String getSavings() {
		return SAVINGS;
	}



	public static String getCurrent() {
		return CURRENT;
	}



	
	
	
	

}
