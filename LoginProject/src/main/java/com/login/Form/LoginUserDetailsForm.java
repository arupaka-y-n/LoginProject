package com.login.Form;


import java.sql.Time;
import javax.persistence.Column;
import org.springframework.data.annotation.Id;
import com.sun.istack.NotNull;



public class LoginUserDetailsForm {

//	user_details
	public class Account {
		
		@Id
		@NotNull
		@Column(name = "ID")
		private int id;
		
		@NotNull
		@Column(name = "USEREMAIL")
		private String userEmail;
		
		@NotNull
		@Column(name = "PASSWPRD")
		private String password;
		
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

}
