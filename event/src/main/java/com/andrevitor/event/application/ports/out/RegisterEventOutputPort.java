package com.andrevitor.event.application.ports.out;

import com.andrevitor.event.application.core.domain.Event;

public interface RegisterEventOutputPort {

    public void register(Event event);
}
