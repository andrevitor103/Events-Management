package com.andrevitor.event.adapters.out;

import com.andrevitor.event.adapters.in.controller.mapper.EventMapper;
import com.andrevitor.event.adapters.out.repository.EventRepository;
import com.andrevitor.event.adapters.out.repository.entity.EventEntity;
import com.andrevitor.event.adapters.out.repository.mapper.EventEntityMapper;
import com.andrevitor.event.application.core.domain.Event;
import com.andrevitor.event.application.ports.out.CancelEventByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CancelEventByIdAdapter implements CancelEventByIdOutputPort {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private EventEntityMapper eventEntityMapper;
    @Override
    public void cancel(Event event) {
        var entity = this.eventEntityMapper.toEventEntity(event);
        this.eventRepository.save(entity);
    }
}
