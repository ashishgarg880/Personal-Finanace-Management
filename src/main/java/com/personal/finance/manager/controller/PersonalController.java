package com.personal.finance.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.finance.manager.entities.PersonalFinance;
import com.personal.finance.manager.service.PersonalFinanceService;

@Component
@RestController
@RequestMapping("infotrixs/")
@Repository
public class PersonalController {
	
	@Autowired
	private PersonalFinanceService personalFinanceService;
	
	@GetMapping
	public String createModulePersonal(@RequestBody PersonalFinance personalFinance) {
		return this.personalFinanceService.createPersonal(personalFinance);
	}
}
