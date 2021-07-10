package demo.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="inquiryform")
public class InquiryEntity {
	
	@Id
	@Column(name="inquiry_no")
	private int inquiryNo;

	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="inquiry_content")
	private String inquiryContent;
	
	@Column(name="adjustment_flag")
	private boolean adjustmentFlag;
	
	
	
	public int getInquiryNo() {
		return inquiryNo;
	}

	public void setInquiryNo(int inquiryNo) {
		this.inquiryNo = inquiryNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getInquiryContent() {
		return inquiryContent;
	}

	public void setInquiryContent(String inquiryContent) {
		this.inquiryContent = inquiryContent;
	}

	public boolean isAdjustmentFlag() {
		return adjustmentFlag;
	}

	public void setAdjustmentFlag(boolean adjustmentFlag) {
		this.adjustmentFlag = adjustmentFlag;
	}

}
