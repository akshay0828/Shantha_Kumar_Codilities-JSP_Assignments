package com.valtech.ac.entity;


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
	
	public static final String SAVINGS = "SB";
	public static final String CURRENT = "CA";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	private String accountType;
	private double balance;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdatedDate;
	private boolean active;
	
	@ManyToMany(targetEntity=Customer.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	@JoinTable(name="customer_account",joinColumns=@JoinColumn(name="account_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="customer_id",referencedColumnName="id"))
	private Set<Customer> customers;
	
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	public static String getSavings() {
		return SAVINGS;
	}
	public static String getCurrent() {
		return CURRENT;
	}
	public Account() {}
	public Account(long id, String accountType, double balance, LocalDateTime creationDate, LocalDateTime lastUpdatedDate,
			boolean active) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.active = active;
	}
	
	public Account(String accountType, double balance) {
		super();
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = LocalDateTime.now();
		this.lastUpdatedDate = LocalDateTime.now();
		this.active = false;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}
