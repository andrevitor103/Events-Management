package com.andrevitor.event.ports.out;

import com.andrevitor.event.core.domain.Event;

import java.util.Optional;

public interface FindEventByIdOutputPort {
    Optional<Event> find(String id);
}
