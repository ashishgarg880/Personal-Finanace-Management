package com.personal.finance.manager.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personal_finance")
public class PersonalFinance {
	@Id
	private int pfId;
	private String pfFirstName;
	private String pfLastName;
	private String pfMobileNo;
	private String pfEmail;
	private String pfPassword;
	
	
	public PersonalFinance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalFinance(int pfId, String pfFirstName, String pfLastName, String pfMobileNo,
			String pfEmail, String pfPassword) {
		super();
		this.pfId = pfId;
		this.pfFirstName = pfFirstName;
		this.pfLastName = pfLastName;
		this.pfMobileNo = pfMobileNo;
		this.pfEmail = pfEmail;
		this.pfPassword = pfPassword;
	}

	@Override
	public String toString() {
		return "PersonalFinance [pfId=" + pfId + ", pfFirstName=" + pfFirstName + ","
				+ " pfLastName=" + pfLastName + ", pfMobileNo=" + pfMobileNo + ", pfEmail=" + pfEmail + ", pfPassword="
				+ pfPassword + "]";
	}
	
	public int getPfId() {
		return pfId;
	}
	public void setPfId(int pfId) {
		this.pfId = pfId;
	}
	public String getPfFirstName() {
		return pfFirstName;
	}
	public void setPfFirstName(String pfFirstName) {
		this.pfFirstName = pfFirstName;
	}
	
	public String getPfLastName() {
		return pfLastName;
	}
	public void setPfLastName(String pfLastName) {
		this.pfLastName = pfLastName;
	}
	public String getPfMobileNo() {
		return pfMobileNo;
	}
	public void setPfMobileNo(String pfMobileNo) {
		this.pfMobileNo = pfMobileNo;
	}
	public String getPfEmail() {
		return pfEmail;
	}
	public void setPfEmail(String pfEmail) {
		this.pfEmail = pfEmail;
	}
	public String getPfPassword() {
		return pfPassword;
	}
	public void setPfPassword(String pfPassword) {
		this.pfPassword = pfPassword;
	}
	
}
