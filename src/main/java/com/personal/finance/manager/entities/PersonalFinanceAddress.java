package com.personal.finance.manager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class PersonalFinanceAddress {
	@Id
	private int adrsId;
	private String adrsName;
	private String adrsState;
	private int adrsPinCode;
	private String adrsCountryName;
	private int adrsZipCode;
	
	
	@Override
	public String toString() {
		return "PersonalFinanceAddress [adrsId=" +adrsId + ", adrsName=" + adrsName + ", adrsState=" + adrsState + ", adrsPinCode="
				+ adrsPinCode + ", adrsCountryName=" + adrsCountryName + ", adrsZipCode=" + adrsZipCode + "]";
	}
	
	
	public PersonalFinanceAddress(String adrsName, String adrsState, int adrsPinCode, String adrsCountryName,
			int adrsZipCode) {
		super();
		this.adrsName = adrsName;
		this.adrsState = adrsState;
		this.adrsPinCode = adrsPinCode;
		this.adrsCountryName = adrsCountryName;
		this.adrsZipCode = adrsZipCode;
	}


	public PersonalFinanceAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAdrsId() {
		return adrsId;
	}

	public void setAdrsId(int adrsId) {
		this.adrsId = adrsId;
	}

	public String getAdrsName() {
		return adrsName;
	}
	public void setAdrsName(String adrsName) {
		this.adrsName = adrsName;
	}
	public String getAdrsState() {
		return adrsState;
	}
	public void setAdrsState(String adrsState) {
		this.adrsState = adrsState;
	}
	public int getAdrsPinCode() {
		return adrsPinCode;
	}
	public void setAdrsPinCode(int adrsPinCode) {
		this.adrsPinCode = adrsPinCode;
	}
	public String getAdrsCountryName() {
		return adrsCountryName;
	}
	public void setAdrsCountryName(String adrsCountryName) {
		this.adrsCountryName = adrsCountryName;
	}
	public int getAdrsZipCode() {
		return adrsZipCode;
	}
	public void setAdrsZipCode(int adrsZipCode) {
		this.adrsZipCode = adrsZipCode;
	}
	
	
}
