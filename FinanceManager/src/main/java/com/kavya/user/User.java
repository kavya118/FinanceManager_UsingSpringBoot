package com.kavya.user;

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
@Table(name = "user_table")
public class User {

	
	//primary key
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		
		@Column(name="name")
		@NotNull
		String name;
		
/*
		@OneToMany(mappedBy = "userid")
		private Set<Credit> credit;*/
		
		
		@Column(name="contactnumber")
		Long contactnumber;
		
		public User(int id) {
			super();
			this.id = id;
		}

		@Column(name="email_id")
		@Email
		String email_id;
		
		public User() {
		}

		public User(String name) {
		}
	

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", contactnumber=" + contactnumber + ", email_id=" + email_id
					+ "]";
		}

		public User(int id, String name, Long contactnumber,
				@Email String email_id) {
			super();
			this.id = id;
			this.name = name;
			this.contactnumber = contactnumber;
			this.email_id = email_id;
		}
		
}

