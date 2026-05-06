package com.cashback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashback.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
