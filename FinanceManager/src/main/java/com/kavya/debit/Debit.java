package com.kavya.debit;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.kavya.expense.Expense;
import com.kavya.user.User;
import com.kavya.wallet.Wallet;

@Entity
public class Debit {

		//primary key
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		
		@ManyToOne
	    @JoinColumn(name="wallet_id")
		Wallet wallet;
		
		//Whether spent for others or groups
		@ManyToOne
		@JoinColumn(name="user_id")
		User userid;
					
		@ManyToOne
		@JoinColumn(name="expense_id")
		Expense expense;
		
		//amount of money debited
		@NotNull
		double amount_debit;	
		
		//where the money came from : eg. which bank account
		@NotNull
		String source_origin;

		//date of transaction
		@NotNull
		Date finance_date;
		
		//Full information of the spend or gain
		String purpose;
		
		//Comments
		String comment;
		
		//cashback offer
		@Enumerated(EnumType.STRING)
		private Cashback cashback_offer;
		
		//cashback came or not
		@Enumerated(EnumType.STRING)
		private Cashback cashback;
		
		public enum Cashback {
		    Yes, No
		}
		
		public Debit() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Wallet getWallet() {
			return wallet;
		}

		public void setWallet(Wallet wallet) {
			this.wallet = wallet;
		}

		public double getAmount_debit() {
			return amount_debit;
		}

		public void setAmount_debit(double amount_debit) {
			this.amount_debit = amount_debit;
		}

		public String getSource_origin() {
			return source_origin;
		}

		public void setSource_origin(String source_origin) {
			this.source_origin = source_origin;
		}

		public Date getFinance_date() {
			return finance_date;
		}

		public void setFinance_date(Date finance_date) {
			this.finance_date = finance_date;
		}

		public String getPurpose() {
			return purpose;
		}

		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Cashback isCashback_offer() {
			return cashback_offer;
		}

		public void setCashback_offer(Cashback cashback_offer) {
			this.cashback_offer = cashback_offer;
		}

		public Cashback isCashback() {
			return cashback;
		}

		public void setCashback(Cashback cashback) {
			this.cashback = cashback;
		}

		public Expense getExpense() {
			return expense;
		}

		public void setExpense(Expense expense) {
			this.expense = expense;
		}

		public Debit(int id, Integer wallet_id, Integer user_id, Integer expense_id, @NotNull double amount_debit,
				@NotNull String source_origin, @NotNull Date finance_date,
				String purpose, String comment, Cashback cashback_offer, Cashback cashback) {
			super();
			this.id = id;
			this.amount_debit = amount_debit;
			this.source_origin = source_origin;
			this.finance_date = finance_date;
			this.purpose = purpose;
			this.comment = comment;
			this.cashback_offer = cashback_offer;
			this.cashback = cashback;
			this.wallet = new Wallet(wallet_id, 0l, "", "", null);
			this.userid = new User(user_id, "", 0l,"");
			this.expense = new Expense(expense_id, "");
		}

		public User getUserid() {
			return userid;
		}

		public void setUserid(User userid) {
			this.userid = userid;
		}

		@Override
		public String toString() {
			return "Debit [id=" + id + ", wallet=" + wallet + ", userid=" + userid + ", expense=" + expense
					+ ", amount_debit=" + amount_debit + ", source_origin=" + source_origin + ", finance_date="
					+ finance_date + ", category_expense=" +  ", purpose=" + purpose + ", comment="
					+ comment + ", cashback_offer=" + cashback_offer + ", cashback=" + cashback + "]";
		}

}
