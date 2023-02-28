package com.andrevitor.event.adapters.out;

import com.andrevitor.event.adapters.out.repository.EventRepository;
import com.andrevitor.event.adapters.out.repository.mapper.EventEntityMapper;
import com.andrevitor.event.application.core.domain.Event;
import com.andrevitor.event.application.ports.out.FindEventByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class FindEventByIdAdapter implements FindEventByIdOutputPort {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private EventEntityMapper eventMapper;
    @Override
    public Optional<Event> find(String id) {
        var eventEntity = this.eventRepository.findById(id);
        return eventEntity.map(entity -> eventMapper.toEvent(entity));
    }
}
