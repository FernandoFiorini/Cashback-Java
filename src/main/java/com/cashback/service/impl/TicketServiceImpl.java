package com.cashback.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cashback.dto.CashbackCampaignDTO;
import com.cashback.dto.CashbackDistributionDTO;
import com.cashback.dto.TicketDTO;
import com.cashback.model.Ticket;
import com.cashback.repository.TicketRepository;
import com.cashback.service.CashbackDistributionService;
import com.cashback.service.CashbackService;
import com.cashback.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	private final TicketRepository ticketRepository;
	private final CashbackService cashbackService;
	private final CashbackDistributionService cashbackDistributionService;

	public TicketServiceImpl(TicketRepository ticketRepository, CashbackService cashbackService,
			CashbackDistributionService cashbackDistributionService) {
		this.ticketRepository = ticketRepository;
		this.cashbackService = cashbackService;
		this.cashbackDistributionService = cashbackDistributionService;
	}

	@Override
	public void processTicket(List<TicketDTO> tickets) throws ParseException {

		// List of all active campaigns of cashback
		List<CashbackCampaignDTO> activeCampaigns = cashbackService.getAllActiveCashbacks();

		// List of distribution of cashback
		List<CashbackDistributionDTO> cashbackDistribution = new ArrayList<>();

		// List of tickets to persist on the database
		List<Ticket> ticketsPersist = new ArrayList<>();

		for (TicketDTO ticketDTO : tickets) {

			Ticket ticket = new Ticket();

			ticket.setBuyDate(ticketDTO.getBuyDate());
			ticket.setUserCode(ticketDTO.getUserCode());
			ticket.setValue(ticketDTO.getValue());
			ticket.setValueCashbackUsed(ticketDTO.getValueCashbackUsed());

			ticketsPersist.add(ticket);

			for (CashbackCampaignDTO campaign : activeCampaigns) {
				if (ticket.getValue().compareTo(campaign.getMinimumValue()) >= 0) {

					BigDecimal cashbackValue = ticket.getValue().multiply(campaign.getCashbackPercentage())
							.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);

					CashbackDistributionDTO cashbackDistributionDTO = cashbackDistributionService
							.getByUserCode(ticket.getUserCode());

					if (cashbackDistributionDTO == null) {
						cashbackDistributionDTO = new CashbackDistributionDTO();
						cashbackDistributionDTO.setValue(BigDecimal.ZERO);
					}

					BigDecimal cashbackBalance = cashbackDistributionDTO.getValue().add(cashbackValue);

					if (ticket.getValueCashbackUsed() != null
							&& ticket.getValueCashbackUsed().compareTo(BigDecimal.ZERO) > 0) {
						cashbackBalance = cashbackBalance.subtract(ticket.getValueCashbackUsed());
					}

					cashbackDistributionDTO.setUserCode(ticket.getUserCode());
					cashbackDistributionDTO.setValue(cashbackBalance);

					cashbackDistribution.add(cashbackDistributionDTO);
				}
			}

		}

		if (!ticketsPersist.isEmpty()) {

			// Persist of the tickets
			this.persistTickets(ticketsPersist);
		}

		if (!cashbackDistribution.isEmpty()) {

			// Persist of the cashbackDistribution
			cashbackDistributionService.persistDistribution(cashbackDistribution);
		}

	}

	private void persistTickets(List<Ticket> ticketPersist) {
		ticketRepository.saveAll(ticketPersist);
	}

}
