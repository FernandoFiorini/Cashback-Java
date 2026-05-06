package com.cashback.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cashback")
public class Cashback {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_cashback")
	@SequenceGenerator(name = "gen_cashback", sequenceName = "gen_cashback", allocationSize = 1)
	@Column(name = "id_cashback")
	private Long id;

	@Column(name = "tx_name")
	private String campaignName;

	@Column(name = "dt_start")
	private Date startDate;

	@Column(name = "dt_end")
	private Date endDate;

	@OneToOne(mappedBy = "cashback")
	private CashbackRules rules;

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

	public CashbackRules getRules() {
		return rules;
	}

	public void setRules(CashbackRules rules) {
		this.rules = rules;
	}

}
