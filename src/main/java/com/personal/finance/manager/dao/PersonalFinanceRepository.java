package com.personal.finance.manager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.finance.manager.entities.PersonalFinance;

public interface PersonalFinanceRepository extends JpaRepository<PersonalFinance, Integer>{
	
}