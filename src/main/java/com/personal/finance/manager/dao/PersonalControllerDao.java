package com.personal.finance.manager.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.personal.finance.manager.entities.PersonalFinance;
import com.personal.finance.manager.service.PersonalFinanceService;

@Repository
public class PersonalControllerDao {
	@Autowired
	private PersonalFinanceService personalFinanceService;
	
	public String createModulePersonal(@RequestBody PersonalFinance personalFinance) {
		return this.personalFinanceService.createPersonal(personalFinance);
	}
	
	public PersonalFinance loginPersonal(String loginId,String password) {
		return this.personalFinanceService.loginPersonal(loginId,password);
	}
}
