package com.andrevitor.event.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class EventRequest {
    @NotBlank
    private final String name;
    @NotBlank
    private final String description;
    @NotBlank
    private final String date;
    @NotNull
    private final Integer numberOfTickets;
}
