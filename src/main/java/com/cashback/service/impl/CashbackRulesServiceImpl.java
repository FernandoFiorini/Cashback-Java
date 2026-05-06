package com.cashback.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cashback.dto.CashbackRulesDTO;
import com.cashback.model.Cashback;
import com.cashback.model.CashbackRules;
import com.cashback.repository.CashbackRulesRepository;
import com.cashback.service.CashbackRulesService;

@Service
public class CashbackRulesServiceImpl implements CashbackRulesService {

	private final CashbackRulesRepository cashbackRulesRepository;

	public CashbackRulesServiceImpl(CashbackRulesRepository cashbackRulesRepository) {
		this.cashbackRulesRepository = cashbackRulesRepository;
	}

	@Override
	public void saveRules(Cashback cashback, CashbackRulesDTO cashbackRulesDTO) {

		Long cashbackRuleId = cashbackRulesDTO.getId();
		CashbackRules cashbackRules = null;

		if (cashbackRuleId != null) {
			Optional<CashbackRules> cashbackRulesOptional = cashbackRulesRepository.findById(cashbackRuleId);

			if (cashbackRulesOptional.isPresent()) {
				cashbackRules = cashbackRulesOptional.get();
			}

		} else {
			cashbackRules = new CashbackRules();
		}

		cashbackRules.setCashback(cashback);
		cashbackRules.setCashbackPercentage(cashbackRulesDTO.getCashbackPercentage());
		cashbackRules.setMinimumValue(cashbackRulesDTO.getMinimumValue());

		cashbackRulesRepository.save(cashbackRules);
	}

}
