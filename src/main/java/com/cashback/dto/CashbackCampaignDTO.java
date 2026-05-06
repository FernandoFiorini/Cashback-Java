package com.cashback.dto;

import java.math.BigDecimal;
import java.util.Date;

public class CashbackCampaignDTO {

	private Long id;

	private String campaignName;

	private Date startDate;

	private Date endDate;

	private BigDecimal minimumValue;

	private BigDecimal cashbackPercentage;

	public CashbackCampaignDTO(Long id, String campaignName, Date startDate, Date endDate, BigDecimal minimumValue,
			BigDecimal cashbackPercentage) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.minimumValue = minimumValue;
		this.cashbackPercentage = cashbackPercentage;
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

	public BigDecimal getMinimumValue() {
		return minimumValue;
	}

	public void setMinimumValue(BigDecimal minimumValue) {
		this.minimumValue = minimumValue;
	}

	public BigDecimal getCashbackPercentage() {
		return cashbackPercentage;
	}

	public void setCashbackPercentage(BigDecimal cashbackPercentage) {
		this.cashbackPercentage = cashbackPercentage;
	}

}
