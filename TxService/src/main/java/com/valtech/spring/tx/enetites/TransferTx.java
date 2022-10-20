package com.valtech.spring.tx.enetites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ttx")
public class TransferTx extends Tx {
	
	private long fromAcc;
	private long toAcc;
	private String transactionId;
	
	
	
	
	
	
	
	
	
	public TransferTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public TransferTx(float amount, boolean debit,long fromAcc, long toAcc, String transactionId) {
		super(amount,debit);
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
		this.transactionId = transactionId;
	}





	public long getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(long fromAcc) {
		this.fromAcc = fromAcc;
	}
	public long getToAcc() {
		return toAcc;
	}
	public void setToAcc(long toAcc) {
		this.toAcc = toAcc;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	
	
	

}
