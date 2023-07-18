package com.personal.finance.manager.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.personal.finance.manager.entities.Expanses;
import com.personal.finance.manager.entities.PersonalFinance;


@Component
public interface PersonalFinanceService {
	public String createPersonal(PersonalFinance personalFinance);
	
	public PersonalFinance loginPersonal(String loginId,String password);
	
	public List<Expanses> getAllExpanses();
	
	public String createExpanses();
}
