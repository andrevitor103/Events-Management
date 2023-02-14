package com.andrevitor.event.adapters.out.repository.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "events")
public class EventEntity {
    private String id;
    private String name;
    private String description;
    private String date;
    private String status;

    public EventEntity(String id, String name, String description, String date, String status) {
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

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
}
