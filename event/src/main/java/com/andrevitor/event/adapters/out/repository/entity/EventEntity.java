package com.andrevitor.event.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Data
@Document(collection = "events")
public class EventEntity {
    private String id;
    private String name;
    private String description;
    private LocalDate date;
    private String status;
    private Integer numberOfTickets;
}
