package com.andrevitor.event.adapters.out.repository.mapper;

import com.andrevitor.event.adapters.out.repository.entity.EventEntity;
import com.andrevitor.event.application.core.domain.Event;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface EventEntityMapper {
    EventEntity toEventEntity(Event event);
}
