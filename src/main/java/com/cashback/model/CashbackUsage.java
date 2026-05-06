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
@Table(name = "tb_cashbackuserusage")
public class CashbackUsage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "gen_cashbackuserusage", sequenceName = "gen_cashbackuserusage", allocationSize = 1)
	@Column(name = "id_cashbackuserusage")
	private Long id;
			
	@Column(name = "cd_user")
	private Long userCode;
	
	@Column(name = "cd_ticket")
	private Long ticketCode;
	
	@Column(name = "vl_usage")
	private BigDecimal valueUsed;
	
	@Column(name = "dt_usage")
	private Date usageDate;

}
