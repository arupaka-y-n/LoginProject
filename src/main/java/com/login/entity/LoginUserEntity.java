package com.login.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name = "user")
public class LoginUserEntity {	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@NotNull
		@Column(name = "ID")
		private int id;
		
		@Column(name = "USEREMAIL")
		private String userEmail;
		
		@Column(name = "CREATED_AT")
		private Time createdTime;
		
		@Column(name = "UPDATED_AT")
		private Time updatedTime;
		
		@Column(name = "is_active")
		private boolean isActive;

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

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
	
}
