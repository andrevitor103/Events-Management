package com.andrevitor.event.application.ports.out;

import com.andrevitor.event.application.core.domain.Event;

import java.util.Optional;

public interface FindEventByIdOutputPort {
    Optional<Event> find(String id);
}
