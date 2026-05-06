package com.cashback.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TicketDTO {

	private Long id;

	private Long userCode;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date buyDate;

	private BigDecimal value;

	private BigDecimal valueCashbackUsed;

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

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getValueCashbackUsed() {
		return valueCashbackUsed;
	}

	public void setValueCashbackUsed(BigDecimal valueCashbackUsed) {
		this.valueCashbackUsed = valueCashbackUsed;
	}

}
