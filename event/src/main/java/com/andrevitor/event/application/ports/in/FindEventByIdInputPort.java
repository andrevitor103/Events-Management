package com.andrevitor.event.application.ports.in;

import com.andrevitor.event.application.core.domain.Event;

public interface FindEventByIdInputPort {
    Event find(String id);
}
