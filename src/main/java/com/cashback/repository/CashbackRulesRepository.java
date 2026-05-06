package com.cashback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashback.model.CashbackRules;

public interface CashbackRulesRepository extends JpaRepository<CashbackRules, Long> {

}
