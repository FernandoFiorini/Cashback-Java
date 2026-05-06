package com.cashback.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_ticket")
	@SequenceGenerator(name = "gen_ticket", sequenceName = "gen_ticket", allocationSize = 1)
	@Column(name = "id_ticket")
	private Long id;

	@Column(name = "cd_user")
	private Long userCode;

	@Column(name = "dt_buy")
	private Date buyDate;

	@Column(name = "vl_value")
	private BigDecimal value;

	@Column(name = "vl_cashbackused")
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
