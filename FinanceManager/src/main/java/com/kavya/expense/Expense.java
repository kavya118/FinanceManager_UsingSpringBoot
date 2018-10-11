package com.kavya.expense;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.kavya.credit.Credit;

@Entity
@Table(name = "expense")
public class Expense {

	
	//primary key
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		
		public Expense(String category) {
		}

		@Column(name="category")
		@NotNull
		String category;

		/*@OneToMany(mappedBy = "expense")
		private Set<Credit> credit;*/
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Expense(int id, @NotNull String category) {
			this.id = id;
			this.category = category;
		}

		public Expense() {
			
		}

		@Override
		public String toString() {
			return "Expense [expense_id=" + id + ", category=" + category + "]";
		}		
}

