package com.cashback.dto;

import java.math.BigDecimal;

public class CashbackDistributionDTO {

	private Long id;

	private Long userCode;

	private BigDecimal value;

	private BigDecimal valueUsed;

	public CashbackDistributionDTO() {
	}

	public CashbackDistributionDTO(Long id, Long userCode, BigDecimal value) {
		super();
		this.id = id;
		this.userCode = userCode;
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserCode() {
		return userCode;
	}

	public void setUserCode(Long userCode) {
		this.userCode = userCode;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
