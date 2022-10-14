package com.valtech.Spring.Boot.New.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("blog")
public class Blog extends Book {
	
	private String url;
	private int visiterNo;
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Blog(String name ,String url, int visiterNo) {
		super(name);
		this.url = url;
		this.visiterNo = visiterNo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getVisiterNo() {
		return visiterNo;
	}
	public void setVisiterNo(int visiterNo) {
		this.visiterNo = visiterNo;
	}
	@Override
	public String toString() {
		return "Blog [url=" + url + ", visiterNo=" + visiterNo + "]";
	}
	
	
	

}
