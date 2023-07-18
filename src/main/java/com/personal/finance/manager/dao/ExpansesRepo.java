package com.personal.finance.manager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.finance.manager.entities.Expanses;

public interface ExpansesRepo extends JpaRepository<Expanses, Integer> {

}
