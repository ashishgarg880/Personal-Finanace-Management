package com.personal.finance.manager.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "expanses")
public class Expanses {
	@Id
	private int expanseId;
	private String productName;
	private int budget;
	private int personalId;
	private Date date;
	
	public Expanses(String productName, int budget, int personalId,Date date) {
		super();
		this.productName = productName;
		this.budget = budget;
		this.personalId = personalId;
		this.date = date;
	}

	public Expanses() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Expanses [productName=" + productName + ", budget=" + budget + ", personalId=" + personalId + ", Date=" + date +"]";
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getPersonalId() {
		return personalId;
	}
	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
