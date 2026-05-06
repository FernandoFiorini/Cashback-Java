package com.cashback.dto;

import java.math.BigDecimal;

public class CashbackUsageDTO {

	private Long id;

	private Long userCode;

	private Long ticketCode;

	private BigDecimal valueUsed;

	private String usageDate;

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

	public Long getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(Long ticketCode) {
		this.ticketCode = ticketCode;
	}

	public BigDecimal getValueUsed() {
		return valueUsed;
	}

	public void setValueUsed(BigDecimal valueUsed) {
		this.valueUsed = valueUsed;
	}

	public String getUsageDate() {
		return usageDate;
	}

	public void setUsageDate(String usageDate) {
		this.usageDate = usageDate;
	}

}
