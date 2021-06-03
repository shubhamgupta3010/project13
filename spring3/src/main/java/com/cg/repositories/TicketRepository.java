package com.cg.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cg.entities.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
