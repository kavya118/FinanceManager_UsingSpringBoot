package com.kavya.wallet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Debit {

		//primary key
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		
		@ManyToOne
		@NotNull
		Wallet wallet;
		
		//amount of money debited
		@NotNull
		double amount_debit;	
		
		//where the money came from : eg. which bank account
		@NotNull
		String source_origin;

		//date of transaction
		@NotNull
		Date finance_date;
		
		//Category of expense if debit
		@NotNull
		String category_expense;
		
		//Full information of the spend or gain
		String purpose;
		
		//Comments
		String comment;
		
		//cashback offer
		boolean cashback_offer;
		
		//cashback came or not
		boolean cashback;
		
		//Whether spent for others or groups
		@NotNull
		String user_money;
}
