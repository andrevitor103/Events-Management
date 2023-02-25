package com.andrevitor.event.adapters.out;

import com.andrevitor.event.adapters.out.repository.EventRepository;
import com.andrevitor.event.adapters.out.repository.mapper.EventEntityMapper;
import com.andrevitor.event.application.core.domain.Event;
import com.andrevitor.event.application.ports.out.RegisterEventOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterEventAdapter implements RegisterEventOutputPort {
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventEntityMapper eventEntityMapper;
    @Override
    public void register(Event event) {
        var entity = this.eventEntityMapper.toEventEntity(event);
        this.eventRepository.save(entity);
    }
}
