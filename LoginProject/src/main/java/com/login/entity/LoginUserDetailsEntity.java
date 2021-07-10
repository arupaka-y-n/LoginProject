package com.login.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.sun.istack.NotNull;


@Entity
@Table(name = "user_detail")
public class LoginUserDetailsEntity {

//	public class Account {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@NotNull
		@Column(name = "ID")
		private int id;
		
		@NotNull
		@Column(name = "USEREMAIL")
		private String userEmail;
		
		@NotNull
		@Column(name = "PASSWORD")
		private String password;
		
		@NotNull
		@Column(name = "USERNAME")
		private String userName;
		
		@Column(name = "uuid")
		private String uuid;
		
		@Column(name = "CREATED_AT")
		private Time createdTime;
		
		@Column(name = "UPDATED_AT")
		private Time updatedTime;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUserName() {
			return userName;
		}

		
		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUuid() {
			return uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Time getCreatedTime() {
			return createdTime;
		}

		public void setCreatedTime(Time createdTime) {
			this.createdTime = createdTime;
		}

		public Time getUpdatedTime() {
			return updatedTime;
		}

		public void setUpdatedTime(Time updatedTime) {
			this.updatedTime = updatedTime;
		}

	
}

