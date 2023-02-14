package com.andrevitor.event.adapters.out.repository.mapper;

import com.andrevitor.event.adapters.out.repository.entity.EventEntity;
import com.andrevitor.event.application.core.domain.Event;
public interface EventEntityMapper {
    Event toEvent(EventEntity eventEntity);
}
