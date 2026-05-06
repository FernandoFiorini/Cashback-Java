package com.cashback.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cashback.dto.TicketDTO;
import com.cashback.service.TicketService;

@RestController
@RequestMapping("/ticketController")
public class TicketController {

	private final TicketService ticketService;

	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	// Process the ticket to persist in the database and checks if can gain or used
	// cashback
	@PostMapping("/processTicket")
	public void processTicket(@RequestBody List<TicketDTO> tickets) throws ParseException {
		ticketService.processTicket(tickets);

	}
}
