package com.juzz.ticketsystem;

import com.juzz.ticketsystem.enums.Priority;
import com.juzz.ticketsystem.enums.Status;
import com.juzz.ticketsystem.service.TicketService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceTest {

    @Test
    void createTicketWorks() {
        TicketService service = new TicketService();
        service.createTicket("WiFi", "Not working", Priority.HIGH);
        assertEquals(1, service.getAllTickets().size());
    }

    @Test
    void updateTicketStatusWorks() {
        TicketService service = new TicketService();
        var ticket = service.createTicket("Bug", "Crash", Priority.MEDIUM);
        service.updateTicket(ticket.getId(), Status.RESOLVED, null);
        assertEquals(Status.RESOLVED, ticket.getStatus());
    }
}
