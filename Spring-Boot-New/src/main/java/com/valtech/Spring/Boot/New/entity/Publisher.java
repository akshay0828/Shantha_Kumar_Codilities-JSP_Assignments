package com.valtech.Spring.Boot.New.entity;

import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String phoneNo;
	
	
	
	@OneToOne(targetEntity=Address.class)
	@JoinColumn(name="address_id",referencedColumnName="id")
	private Address address;
	
	@OneToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.LAZY,mappedBy="publisher")
	// @JoinColumn(name="book_id",referencedColumnName="id")
	private Set<Book> books;

	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publisher(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		//this.address=address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + ", books="
				+ books + "]";
	}
	
	
	

}
