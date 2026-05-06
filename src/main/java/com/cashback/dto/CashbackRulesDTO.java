package com.cashback.dto;

import java.math.BigDecimal;

public class CashbackRulesDTO {

	private Long id;

	private Long cashbackCode;

	private BigDecimal minimumValue;

	private BigDecimal cashbackPercentage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCashbackCode() {
		return cashbackCode;
	}

	public void setCashbackCode(Long cashbackCode) {
		this.cashbackCode = cashbackCode;
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
