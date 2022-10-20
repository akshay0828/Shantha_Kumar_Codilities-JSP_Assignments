package com.valtech.spring.tx.enetites;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="All_Transaction")
@DiscriminatorColumn(name="dics")
@DiscriminatorValue("tx")
public class Tx {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	private float amount;
	private boolean debit;
	private LocalDateTime txtime;
	private long accountId;
	
	
	
	
	
	
	
	public Tx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Tx(long id, float amount, boolean debit, LocalDateTime txtime, long accountId) {
		super();
		this.id = id;
		this.amount = amount;
		this.debit = debit;
		this.txtime = txtime;
		this.accountId = accountId;
	}

	
	


	public Tx(float amount, boolean debit, LocalDateTime txtime, long accountId) {
		super();
		this.amount = amount;
		this.debit = debit;
		this.txtime = txtime;
		this.accountId = accountId;
	}

	

	
	
	public Tx(float amount, boolean debit) {
		super();
		this.amount = amount;
		this.debit = debit;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public boolean isDebit() {
		return debit;
	}
	public void setDebit(boolean debit) {
		this.debit = debit;
	}
	public LocalDateTime getTxtime() {
		return txtime;
	}
	public void setTxtime(LocalDateTime txtime) {
		this.txtime = txtime;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
	
	
	
	
	
	
	

}
