package com.andrevitor.event.application.core.domain;

import java.time.LocalDate;
import java.util.UUID;

public class Event {
    private String id;
    private Status status;
    private final String name;
    private final String description;
    private final LocalDate date;
    private final Integer numberOfTickets;

    public Event(String name, String description, String date, Integer numberOfTickets) {
        this.name = name;
        this.description = description;
        this.date = LocalDate.parse(date);
        this.numberOfTickets = numberOfTickets;
    }
    public void register() {
        this.id = UUID.randomUUID().toString();
        this.status = Status.ACTIVE;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }
    public Status getStatus() {
        return status;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }
}
