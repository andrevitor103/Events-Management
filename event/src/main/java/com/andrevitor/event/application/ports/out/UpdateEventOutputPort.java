package com.andrevitor.event.application.ports.out;

import com.andrevitor.event.application.core.domain.Event;

public interface UpdateEventOutputPort {

    void update(Event event);
}
