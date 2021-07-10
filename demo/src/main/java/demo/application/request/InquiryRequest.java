package demo.application.request;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;

@Component
public class InquiryRequest {

	private int inquiryNo;
	
	private String userName;
	
	@NotNull
	private String userEmail;
	
	private String inquiryContent;
	
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
