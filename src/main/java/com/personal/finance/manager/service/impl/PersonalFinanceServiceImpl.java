package com.personal.finance.manager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.finance.manager.dao.PersonalFinanceRepository;
import com.personal.finance.manager.entities.PersonalFinance;
import com.personal.finance.manager.service.PersonalFinanceService;

@Service
public class PersonalFinanceServiceImpl implements PersonalFinanceService{
	
	@Autowired
	public PersonalFinanceRepository personalFinanceRepository;
	
	public String createPersonal(PersonalFinance personalFinance) {
		List<PersonalFinance> list = new ArrayList<>();
		list = this.personalFinanceRepository.findAll();
		list = list.stream().filter(n-> n.getPfEmail().equals(personalFinance.getPfEmail()) && n.getPfMobileNo() == personalFinance.getPfMobileNo() ).collect(Collectors.toList());
		if(list.size() > 0) {
			return "Data is already exist";
		}
		this.personalFinanceRepository.save(personalFinance);
		return "Data saved";
	}
	
	public PersonalFinance loginPersonal(String loginId,String password) {
		PersonalFinance personalFinance = new PersonalFinance();
		List<PersonalFinance> list = new ArrayList<>(); 
		list = this.personalFinanceRepository.findAll();
		System.out.println(">>>>>>>" + list);
		list = list.stream().filter(n -> n.getPfEmail().equals(loginId) || n.getPfMobileNo() == Integer.parseInt(loginId) &&  n.getPfPassword().equals(password)).collect(Collectors.toList());
		if(list.size() > 0) {
			personalFinance = list.get(0);
			return personalFinance;
		}
		return personalFinance;
	}
}
