package com.juzz.ticketsystem.controller;

import com.juzz.ticketsystem.dto.TicketRequest;
import com.juzz.ticketsystem.model.Ticket;
import com.juzz.ticketsystem.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    // sanity check
    @GetMapping("/ping")
    public String ping() {
        return "Ticket API is alive";
    }

    @GetMapping
    public Collection<Ticket> getAllTickets() {
        return service.getAllTickets();
    }

    @PostMapping
    public Ticket createTicket(@RequestBody TicketRequest request) {
        return service.createTicket(
                request.getTitle(),
                request.getDescription(),
                request.getPriority()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ticket> updateTicket(
            @PathVariable int id,
            @RequestBody TicketRequest request) {

        Ticket ticket = service.updateTicket(id, request.getStatus(), request.getPriority());
        return ticket != null
                ? ResponseEntity.ok(ticket)
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTicket(@PathVariable int id) {
        return service.deleteTicket(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
