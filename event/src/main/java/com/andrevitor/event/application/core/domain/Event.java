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

    public Event(String id, String name, String description, String date, Integer numberOfTickets) {
        this.name = name;
        this.description = description;
        this.date = LocalDate.parse(date);
        this.numberOfTickets = numberOfTickets;
        this.addEventId(id);
    }


    private void addEventId(String id) {
        if ( this.isNew() ) {
            this.id = id;
        }
    }
    private Boolean isNew() {
        return this.id == null;
    }
    public void register() {
        this.id = UUID.randomUUID().toString();
        this.status = Status.ACTIVE;
    }
    public void cancel() {
        if (this.status == Status.EXPIRED) {
            return;
        }
        this.status = Status.CANCELLED;
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
