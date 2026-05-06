package com.cashback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ticketitem")
public class TicketItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "gen_ticketitem", sequenceName = "gen_ticketitem", allocationSize = 1)
	@Column(name = "id_ticketitem")
	private Long id;

	@Column(name = "cd_product")
	private Long productCode;

	@Column(name = "cd_ticket")
	private Long ticketCode;

}
