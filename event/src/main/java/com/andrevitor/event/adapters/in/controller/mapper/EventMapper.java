package com.andrevitor.event.adapters.in.controller.mapper;

import com.andrevitor.event.adapters.in.controller.reponse.EventResponse;
import com.andrevitor.event.application.core.domain.Event;

public class EventMapper {
    public static EventResponse toEventResponse(Event event) {
        return new EventResponse(
                event.getName(),
                event.getDescription(),
                event.getDate(),
                event.getStatus().toString()
        );
    }
}
