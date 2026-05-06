package com.cashback.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CashbackDTO {

	private Long id;

	private String campaignName;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endDate;

	private CashbackRulesDTO cashbackRulesDTO;

	public CashbackRulesDTO getCashbackRulesDTO() {
		return cashbackRulesDTO;
	}

	public void setCashbackRulesDTO(CashbackRulesDTO cashbackRulesDTO) {
		this.cashbackRulesDTO = cashbackRulesDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
