package com.juzz.ticketsystem.service;

import com.juzz.ticketsystem.enums.Priority;
import com.juzz.ticketsystem.enums.Status;
import com.juzz.ticketsystem.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class TicketService {

    private final Map<Integer, Ticket> tickets = new TreeMap<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    public Ticket createTicket(String title, String description, Priority priority) {
        int id = idCounter.getAndIncrement();
        Ticket ticket = new Ticket(id, title, description, priority);
        tickets.put(id, ticket);
        return ticket;
    }

    public Collection<Ticket> getAllTickets() {
        return tickets.values();
    }

    public Ticket getTicket(int id) {
        return tickets.get(id);
    }

    public Ticket updateTicket(int id, Status status, Priority priority) {
        Ticket ticket = tickets.get(id);
        if (ticket == null) return null;

        if (status != null) ticket.setStatus(status);
        if (priority != null) ticket.setPriority(priority);
        return ticket;
    }

    public boolean deleteTicket(int id) {
        return tickets.remove(id) != null;
    }
}
