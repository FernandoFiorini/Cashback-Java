package com.cashback.service;

import java.util.List;

import com.cashback.dto.CashbackCampaignDTO;
import com.cashback.dto.CashbackDTO;

public interface CashbackService {

	List<CashbackCampaignDTO> getAllActiveCashbacks();

	void saveCampaign(CashbackDTO cashbackDTO);
}
