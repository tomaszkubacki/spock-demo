package org.random.spockdemo.repository;

import org.random.spockdemo.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public abstract class TicketRepository implements JpaRepository<Ticket, UUID> {

}
