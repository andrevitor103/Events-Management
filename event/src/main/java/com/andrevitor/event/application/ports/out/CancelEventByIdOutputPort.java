package com.andrevitor.event.application.ports.out;

import com.andrevitor.event.application.core.domain.Event;
public interface CancelEventByIdOutputPort {
    void cancel(Event event);
}
