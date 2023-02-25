package com.andrevitor.event.application.ports.in;

import com.andrevitor.event.application.core.domain.Event;

public interface RegisterEventInputPort {
    void register(Event event);
}
