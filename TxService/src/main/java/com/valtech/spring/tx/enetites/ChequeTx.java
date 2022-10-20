package com.valtech.spring.tx.enetites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ctx")
public class ChequeTx extends Tx {
	
	private long chequeNo;
	private boolean outstation;
	private float charges;
	
	
	
	
	
	
	public ChequeTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChequeTx(float amount, boolean debit,long chequeNo, boolean outstation, float charges) {
		super(amount,debit);
		this.chequeNo = chequeNo;
		this.outstation = outstation;
		this.charges = charges;
	}
	public long getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(long chequeNo) {
		this.chequeNo = chequeNo;
	}
	public boolean isOutstation() {
		return outstation;
	}
	public void setOutstation(boolean outstation) {
		this.outstation = outstation;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	
	

}
