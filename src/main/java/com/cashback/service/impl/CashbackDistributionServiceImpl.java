package com.cashback.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cashback.dto.CashbackDistributionDTO;
import com.cashback.model.CashbackDistribution;
import com.cashback.repository.CashbackDistributionRepository;
import com.cashback.service.CashbackDistributionService;

@Service
public class CashbackDistributionServiceImpl implements CashbackDistributionService {

	private final CashbackDistributionRepository cashbackDistributionRepository;

	public CashbackDistributionServiceImpl(CashbackDistributionRepository cashbackDistributionRepository) {
		this.cashbackDistributionRepository = cashbackDistributionRepository;
	}

	@Override
	public CashbackDistributionDTO getByUserCode(Long userCode) {
		return cashbackDistributionRepository.getByUserCode(userCode);
	}

	@Override
	public void persistDistribution(List<CashbackDistributionDTO> cashbackDistribution) {

		List<CashbackDistribution> cashbackDistributionsSaveList = new ArrayList<>();

		for (CashbackDistributionDTO cashbackDistributionDTO : cashbackDistribution) {
			CashbackDistribution cashbackDistributionSave = new CashbackDistribution();

			cashbackDistributionSave.setId(cashbackDistributionDTO.getId());
			cashbackDistributionSave.setUserCode(cashbackDistributionDTO.getUserCode());
			cashbackDistributionSave.setValue(cashbackDistributionDTO.getValue());

			cashbackDistributionsSaveList.add(cashbackDistributionSave);
		}

		cashbackDistributionRepository.saveAll(cashbackDistributionsSaveList);

	}

	@Override
	public List<CashbackDistributionDTO> getCashbackDistribution() {
		return cashbackDistributionRepository.getCashbackDistribution();
	}

	@Override
	public BigDecimal getTotalCashbackDistribution() {
		return cashbackDistributionRepository.getTotalCashbackDistribution();
	}

}
