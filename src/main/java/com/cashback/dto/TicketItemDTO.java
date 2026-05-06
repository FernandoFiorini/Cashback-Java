package com.cashback.dto;

public class TicketItemDTO {

	private Long id;

	private Long productCode;

	private Long ticketCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public Long getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(Long ticketCode) {
		this.ticketCode = ticketCode;
	}

}
