package com.cashback.service;

import com.cashback.dto.CashbackRulesDTO;
import com.cashback.model.Cashback;

public interface CashbackRulesService {

	void saveRules(Cashback cashback, CashbackRulesDTO cashbackRulesDTO);

}
