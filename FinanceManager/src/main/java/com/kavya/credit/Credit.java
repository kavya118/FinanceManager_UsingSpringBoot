package com.kavya.credit;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.kavya.debit.Debit;
import com.kavya.expense.Expense;
import com.kavya.user.User;
import com.kavya.wallet.Wallet;

@Entity(name = "credit")
public class Credit {

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
		
		//amount of money credited
		@NotNull
		double amount_credit;
		
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
		
		/*@NotNull
		Integer wallet_id;
		public User getUserid() {
			return userid;
		}

		public void setUserid(User userid) {
			this.userid = userid;
		}

		public Integer getWallet_id() {
			return wallet_id;
		}

		public void setWallet_id(Integer wallet_id) {
			this.wallet_id = wallet_id;
		}

		public Integer getUser_id() {
			return user_id;
		}

		public void setUser_id(Integer user_id) {
			this.user_id = user_id;
		}

		public Integer getExpense_id() {
			return expense_id;
		}

		public void setExpense_id(Integer expense_id) {
			this.expense_id = expense_id;
		}

		@NotNull
		Integer user_id;
		@NotNull
		Integer expense_id;*/
		
		public Credit() {
		}

		public Credit(int id, @NotNull Integer wallet_id, @NotNull double amount_credit, @NotNull String source_origin,
				Date finance_date, String purpose, String comment, @NotNull Integer user_id,
				@NotNull Integer expense_id) {
			this.id = id;
			this.amount_credit = amount_credit;
			this.source_origin = source_origin;
			this.finance_date = finance_date;
			this.purpose = purpose;
			this.comment = comment;
			this.wallet = new Wallet(wallet_id, 0l, "", "", null);
			this.userid = new User(user_id, "", 0l,"");
			this.expense = new Expense(expense_id, "");
			
		}

		@Override
		public String toString() {
			return "Credit [id=" + id + ", wallet=" + wallet + ", amount_credit=" + amount_credit + ", source_origin="
					+ source_origin + ", finance_date=" + finance_date + ", purpose=" + purpose + ", comment=" + comment
					+ ", user_money=" + userid+ ", expense=" + expense + "]";
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

		public double getAmount_credit() {
			return amount_credit;
		}

		public void setAmount_credit(double amount_credit) {
			this.amount_credit = amount_credit;
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

		public User getUser_money() {
			return userid;
		}

		public void setUser_money(User user_money) {
			this.userid = user_money;
		}

		public Expense getExpense() {
			return expense;
		}

		public void setExpense(Expense expense) {
			this.expense = expense;
		}

		
		
}
