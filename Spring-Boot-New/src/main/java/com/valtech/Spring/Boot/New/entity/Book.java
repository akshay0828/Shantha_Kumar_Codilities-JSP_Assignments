package com.valtech.Spring.Boot.New.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="allbooks")
@DiscriminatorColumn(name="dics")
@DiscriminatorValue("book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String name;
	private String whenPublished;
	
	
	 @ManyToOne(targetEntity=Publisher.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
		@JoinColumn(name="publisher_id",referencedColumnName="id")
	
	 
	 private Publisher publisher;
	
	
	
	
	@ManyToMany(targetEntity=Author.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="author_id",referencedColumnName="id")
	
	@JoinTable(name="Author_book",joinColumns=@JoinColumn(name="book_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="author_id",referencedColumnName="id"))
	private Set<Author> Author;
	 
	 
	 
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Book(String name) {
		super();
		this.name = name;
	}



	public Book(String name, String whenPublished) {
		super();
		this.name = name;
		this.whenPublished = whenPublished;
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
	public String getWhenPublished() {
		return whenPublished;
	}
	public void setWhenPublished(String whenPublished) {
		this.whenPublished = whenPublished;
	}



	public Set<Author> getAuthor() {
		return Author;
	}



	public void setAuthor(Set<Author> author) {
		Author = author;
	}



	public Publisher getPublisher() {
		return publisher;
	}



	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", whenPublished=" + whenPublished + ", Author=" + Author + "]";
	}
	
	
	
	

}
