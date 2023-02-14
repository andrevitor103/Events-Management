package com.andrevitor.event.adapters.out.repository.mapper;

import com.andrevitor.event.adapters.out.repository.entity.EventEntity;
import com.andrevitor.event.application.core.domain.Event;

public class EventEntityMapperAdapter {
    public Event toEvent(EventEntity eventEntity) {
        return new Event(
                eventEntity.getId(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getDate()
        );
    }
}
