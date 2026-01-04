package com.juzz.ticketsystem.dto;

import com.juzz.ticketsystem.enums.Priority;
import com.juzz.ticketsystem.enums.Status;

public class TicketRequest {

    private String title;
    private String description;
    private Priority priority;
    private Status status;

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Priority getPriority() { return priority; }
    public Status getStatus() { return status; }
}
