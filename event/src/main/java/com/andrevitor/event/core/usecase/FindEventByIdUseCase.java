package com.andrevitor.event.core.usecase;

import com.andrevitor.event.core.domain.Event;
import com.andrevitor.event.ports.in.FindEventByIdInputPort;
import com.andrevitor.event.ports.out.FindEventByIdOutputPort;
public class FindEventByIdUseCase implements FindEventByIdInputPort {

    private final FindEventByIdOutputPort findEventByIdOutputPort;

    public FindEventByIdUseCase(FindEventByIdOutputPort findEventByIdOutputPort) {
        this.findEventByIdOutputPort = findEventByIdOutputPort;
    }
    public Event find(String id) {
        return this.findEventByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Event not found"));
    }
}
