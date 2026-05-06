package com.cashback.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cashback.dto.CashbackCampaignDTO;
import com.cashback.dto.CashbackDTO;
import com.cashback.model.Cashback;
import com.cashback.repository.CashbackRepository;
import com.cashback.service.CashbackRulesService;
import com.cashback.service.CashbackService;

@Service
public class CashbackServiceImpl implements CashbackService {

	private final CashbackRepository cashbackRepository;
	private final CashbackRulesService cashbackRulesService;

	public CashbackServiceImpl(CashbackRepository cashbackRepository, CashbackRulesService cashbackRulesService) {
		this.cashbackRepository = cashbackRepository;
		this.cashbackRulesService = cashbackRulesService;
	}

	@Override
	public List<CashbackCampaignDTO> getAllActiveCashbacks() {
		return cashbackRepository.getAllActiveCashbacks();
	}

	@Override
	public void saveCampaign(CashbackDTO cashbackDTO) {

		Long cashbackCode = cashbackDTO.getId();

		Cashback cashback = null;

		if (cashbackCode != null) {
			Optional<Cashback> cashbackOptional = cashbackRepository.findById(cashbackDTO.getId());

			if (cashbackOptional.isPresent()) {
				cashback = cashbackOptional.get();
			}

		} else {
			cashback = new Cashback();
		}

		cashback.setCampaignName(cashbackDTO.getCampaignName());
		cashback.setStartDate(cashbackDTO.getStartDate());
		cashback.setEndDate(cashbackDTO.getEndDate());

		Cashback savedCashback = cashbackRepository.save(cashback);

		cashbackCode = savedCashback.getId();

		cashbackRulesService.saveRules(savedCashback, cashbackDTO.getCashbackRulesDTO());

	}

}
