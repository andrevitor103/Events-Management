package com.andrevitor.event.ports.out;

import com.andrevitor.event.core.domain.Event;

public interface RegisterEventOutputPort {

    public void register(Event event);
}
