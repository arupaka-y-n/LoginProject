package com.todo.base.Form;

import javax.persistence.Column;
import javax.validation.constraints.Size;
import org.springframework.stereotype.Component;
import com.sun.istack.NotNull;

@Component
public class InquiryForm {
	
	@Column(name = "INQUIRY_TYPE")
	@NotNull
	private int inquiryType;
	
	@Column(name = "INQUIRY_USER")
	@Size(min=1, max=30, message="お名前を入力してください")
	@NotNull
	private String inquiryUser;
	
	@Column(name = "INQUIRY_USER_MAIL")
	@Size(message="メールアドレスの形式で入力してください")
	@NotNull
	private String inquiryUserMail;
	
	@Column(name = "INQUIRY_INFO")
	@Size(min=20, max=100, message="20文字以上100文字以内で入力してください")
	@NotNull
	private String inquiryInfo;
	
	@Column(name = "INQUIRY_TIME")
	@NotNull
	private String inquiryTime;

	public int getInquiryType() {
		return inquiryType;
	}

	public void setInquiryType(int inquiryType) {
		this.inquiryType = inquiryType;
	}

	public String getInquiryUser() {
		return inquiryUser;
	}

	public void setInquiryUser(String inquiryUser) {
		this.inquiryUser = inquiryUser;
	}

	public String getInquiryUserMail() {
		return inquiryUserMail;
	}

	public void setInquiryUserMail(String inquiryUserMail) {
		this.inquiryUserMail = inquiryUserMail;
	}

	public String getInquiryInfo() {
		return inquiryInfo;
	}

	public void setInquiryInfo(String inquiryInfo) {
		this.inquiryInfo = inquiryInfo;
	}

	public String getInquiryTime() {
		return inquiryTime;
	}

	public void setInquiryTime(String inquiryTime) {
		this.inquiryTime = inquiryTime;
	}
}
