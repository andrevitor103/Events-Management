package com.andrevitor.event.ports.out;

import com.andrevitor.event.core.domain.Event;

public interface UpdateEventOutputPort {

    void update(Event event);
}
