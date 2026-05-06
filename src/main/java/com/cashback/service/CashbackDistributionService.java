package com.cashback.service;

import java.math.BigDecimal;
import java.util.List;

import com.cashback.dto.CashbackDistributionDTO;

public interface CashbackDistributionService {

	CashbackDistributionDTO getByUserCode(Long userCode);

	void persistDistribution(List<CashbackDistributionDTO> cashbackDistribution);

	List<CashbackDistributionDTO> getCashbackDistribution();

	BigDecimal getTotalCashbackDistribution();

}
