package valtechSpring.orm;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("handbook")
public class HandBook extends Book{
	
	private String isbn;
	private float price;
	private Date publishedyear;
	private int edition;
	public HandBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HandBook(String name,String isbn, float price, Date publishedyear, int edition) {
		super(name);
		this.isbn = isbn;
		this.price = price;
		this.publishedyear = publishedyear;
		this.edition = edition;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getPublishedyear() {
		return publishedyear;
	}
	public void setPublishedyear(Date publishedyear) {
		this.publishedyear = publishedyear;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	@Override
	public String toString() {
		return "HandBook [isbn=" + isbn + ", price=" + price + ", publishedyear=" + publishedyear + ", edition="
				+ edition + "]";
	}
	
	

}
