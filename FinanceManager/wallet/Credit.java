package com.kavya.wallet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Credit {

		//primary key
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		
		@ManyToOne
		@NotNull
		Wallet wallet;
		
		//amount of money credited
		@NotNull
		double amount_credit;
		
		//where the money came from : eg. which bank account
		@NotNull
		String source_origin;

		//date of transaction
		Date finance_date;
		
		//Full information of the spend or gain
		String purpose;
		
		//Comments
		String comment;		
		
		//Whether spent for others or groups
		@NotNull
		String user_money;
		
}
