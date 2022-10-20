package com.valtech.spring.tx.enetites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("wtx")
public class WithdrawTx extends Tx {
	
	private int AtmNo;
	private String location;
	
	
	public WithdrawTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public WithdrawTx(float amount, boolean debit,int atmNo, String location) {
		super(amount,debit);
		AtmNo = atmNo;
		this.location = location;
	}
	
	
	public int getAtmNo() {
		return AtmNo;
	}
	public void setAtmNo(int atmNo) {
		AtmNo = atmNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	

}
