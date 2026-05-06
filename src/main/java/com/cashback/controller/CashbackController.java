package com.cashback.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cashback.dto.CashbackDTO;
import com.cashback.dto.CashbackDistributionDTO;
import com.cashback.service.CashbackDistributionService;
import com.cashback.service.CashbackService;

@RestController
@RequestMapping("/cashback")
public class CashbackController {

	private final CashbackService cashbackService;
	private final CashbackDistributionService cashbackDistributionService;

	public CashbackController(CashbackService cashbackService,
			CashbackDistributionService cashbackDistributionService) {
		this.cashbackService = cashbackService;
		this.cashbackDistributionService = cashbackDistributionService;
	}

	// Used for data analysis or for sheets, to see how much cashback has been
	// distributed per user
	@GetMapping("/getCashbackDistribution")
	public List<CashbackDistributionDTO> getCashbackDistribution() {

		return cashbackDistributionService.getCashbackDistribution();
	}

	// Used for data analysis or for sheets, to see how much cashback has been
	// distributed in total value
	@GetMapping("/getTotalCashbackDistribution")
	public BigDecimal getTotalCashbackDistribution() {

		return cashbackDistributionService.getTotalCashbackDistribution();
	}

	// Creates or edit a cashback campaign
	@PostMapping("/saveCampaign")
	public void saveCampaign(@RequestBody CashbackDTO cashbackDTO) throws ParseException {
		cashbackService.saveCampaign(cashbackDTO);

	}

}
