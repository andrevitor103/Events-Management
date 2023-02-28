package com.andrevitor.event.adapters.in.controller.mapper;

import com.andrevitor.event.adapters.in.controller.request.EventRequest;
import com.andrevitor.event.adapters.out.repository.entity.EventEntity;
import com.andrevitor.event.application.core.domain.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventMapper {
    @Mapping(target = "status", ignore = true)
    Event toEvent(EventRequest eventRequest);
}
