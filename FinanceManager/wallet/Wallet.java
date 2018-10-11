package com.kavya.wallet;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Wallet {

	//primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public Wallet() {
	}

	

	public Wallet(int id, Set<Debit> debit, Set<Credit> credit) {
		super();
		this.id = id;
		this.debit = debit;
		this.credit = credit;
	}



	public Set<Debit> getDebit() {
		return debit;
	}

	public void setDebit(Set<Debit> debit) {
		this.debit = debit;
	}

	public Set<Credit> getCredit() {
		return credit;
	}

	public void setCredit(Set<Credit> credit) {
		this.credit = credit;
	}



	@OneToMany
	private Set<Debit> debit;
	
	@OneToMany
	private Set<Credit> credit;

	@Override
	public String toString() {
		return "Wallet [id=" + id + ", debit=" + debit + ", credit=" + credit + "]";
	}

	
	
}
