package com.valtech.Spring.Boot.New.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String name;
	private String phoneNo;
	
	
	@OneToOne(targetEntity=Address.class)
	@JoinColumn(name="address_id",referencedColumnName="id")
	//@Embedded
	private Address address;
	
	@ManyToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="Author")
	//@JoinTable(name="Author_book",joinColumns=@JoinColumn(name="Author_id",referencedColumnName="id"),
	//inverseJoinColumns=@JoinColumn(name="book_id",referencedColumnName="id"))
	private Set<Book> book;
	
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
				
	}
	
	
public void addBook(Book ac){
		
		if(getBook()==null){
			book=new HashSet<Book>();
			
		}
		book.add(ac);
		
		if(ac.getAuthor()==null){
			ac.setAuthor(new HashSet<Author>());
		}
		ac.getAuthor().add(this);
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
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + ", book="
				+ book + "]";
	}
	
	
	
	
}
