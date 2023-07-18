package com.personal.finance.manager.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personalfinance")
public class PersonalFinance {
	@Id
	private int pfId;
	private String pfFirstName;
	
	@OneToOne(targetEntity = PersonalFinanceAddress.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "adrs_id")
	private PersonalFinanceAddress pfAddress;
	private String pfLastName;
	private int pfMobileNo;
	private String pfEmail;
	private String pfPassword;
	
	
	public PersonalFinance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalFinance(int pfId, String pfFirstName, PersonalFinanceAddress pfAddress, String pfLastName, int pfMobileNo,
			String pfEmail, String pfPassword) {
		super();
		this.pfId = pfId;
		this.pfFirstName = pfFirstName;
		this.pfAddress = pfAddress;
		this.pfLastName = pfLastName;
		this.pfMobileNo = pfMobileNo;
		this.pfEmail = pfEmail;
		this.pfPassword = pfPassword;
	}

	@Override
	public String toString() {
		return "PersonalFinance [pfId=" + pfId + ", pfFirstName=" + pfFirstName + ", pfAddress=" + pfAddress
				+ ", pfLastName=" + pfLastName + ", pfMobileNo=" + pfMobileNo + ", pfEmail=" + pfEmail + ", pfPassword="
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
	public PersonalFinanceAddress getPfAddress() {
		return pfAddress;
	}
	public void setPfAddress(PersonalFinanceAddress pfAddress) {
		this.pfAddress = pfAddress;
	}
	public String getPfLastName() {
		return pfLastName;
	}
	public void setPfLastName(String pfLastName) {
		this.pfLastName = pfLastName;
	}
	public int getPfMobileNo() {
		return pfMobileNo;
	}
	public void setPfMobileNo(int pfMobileNo) {
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
