package com.kavya.wallet;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import com.kavya.credit.Credit;
import com.kavya.debit.Debit;


/* A Wallet reflects different kinds of applications or methods for users to make payments. For example, 
 Paytm is one such popular Indian e-commerce payment system and digital wallet. Each Paytm account is 
 associated with contact number and/or email ID. A user can create an account in the application, and 
 add money through netbanking, card payments etc. The wallet money can then be used to make various online
 payments or recharges etc.
 
 The Wallet entity should store the balance, and the history of transactions. */

@Entity
@Table(name = "wallet")
public class Wallet {

	
	//primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//Phone Number for the wallet account
	@Column(name="contactnumber")
	Long contactnumber;

	//Email ID for the wallet account
	@Column(name="email")
	@Email
	String email_id;
	
	//Name of the user
	@Column(name="name")
	String name;
	
	/*@OneToMany(mappedBy = "wallet")
	private Set<Debit> debit;*/
	
	/*@OneToMany(mappedBy = "wallet")
	private Set<Credit> credit;
	*/
	
	/* Added this constructor to resolve the error 'no String-argument constructor/factory method to deserialize from String'
value...' DO NOT remove this piece of code*/
	public Wallet(String name) {
		this.name = name;
	}

	public Wallet() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

/* To add the Debit and Credit to Wallets as an enhancement */ 
/*	public Set<Debit> getDebit() {
		return debit;
	}

	public void setDebit(Set<Debit> debit) {
		this.debit = debit;
	}*/

	/*public Set<Credit> getCredit() {
		return credit;
	}

	public void setCredit(Set<Credit> credit) {
		this.credit = credit;
	}*/

	public Wallet(int id, Long contactnumber, @Email String email_id, String name,
			Set<Credit> credit) {
		super();
		this.id = id;
		this.contactnumber = contactnumber;
		this.email_id = email_id;
		this.name = name;
		//this.debit = debit;
		//this.credit = credit;
	}

	
	
	
}
