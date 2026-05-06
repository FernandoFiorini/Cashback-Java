package com.cashback.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cashbackrules")
public class CashbackRules {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_cashbackrules")
	@SequenceGenerator(name = "gen_cashbackrules", sequenceName = "gen_cashbackrules", allocationSize = 1)
	@Column(name = "id_cashbackrules")
	private Long id;

	@OneToOne
	@JoinColumn(name = "cd_cashback")
	private Cashback cashback;

	@Column(name = "vl_minimum")
	private BigDecimal minimumValue;

	@Column(name = "pc_cashback")
	private BigDecimal cashbackPercentage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Cashback getCashback() {
		return cashback;
	}

	public void setCashback(Cashback cashback) {
		this.cashback = cashback;
	}

}
