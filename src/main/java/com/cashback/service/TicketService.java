package com.cashback.service;

import java.text.ParseException;
import java.util.List;

import com.cashback.dto.TicketDTO;

public interface TicketService {

	void processTicket(List<TicketDTO> tickets) throws ParseException;

}
