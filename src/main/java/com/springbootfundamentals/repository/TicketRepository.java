package com.springbootfundamentals.repository;

import com.springbootfundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket,Long> {
}
