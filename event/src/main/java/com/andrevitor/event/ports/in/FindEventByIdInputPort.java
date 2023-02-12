package com.andrevitor.event.ports.in;

import com.andrevitor.event.core.domain.Event;

public interface FindEventByIdInputPort {
    Event find(String id);
}
