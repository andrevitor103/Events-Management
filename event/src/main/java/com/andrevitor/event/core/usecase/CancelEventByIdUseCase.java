package com.andrevitor.event.core.usecase;

import com.andrevitor.event.core.domain.Status;
import com.andrevitor.event.ports.in.FindEventByIdInputPort;
import com.andrevitor.event.ports.out.UpdateEventOutputPort;

public class CancelEventByIdUseCase {
    private final FindEventByIdInputPort findEventByIdInputPort;

    private final UpdateEventOutputPort updateEventOutputPort;

    public CancelEventByIdUseCase(FindEventByIdInputPort findEventByIdInputPort, UpdateEventOutputPort updateEventOutputPort) {
        this.findEventByIdInputPort = findEventByIdInputPort;
        this.updateEventOutputPort = updateEventOutputPort;
    }
    public void cancel(String id) {
        var event = this.findEventByIdInputPort.find(id);
        if (event.getStatus().equals(Status.CANCELLED)) {
            return;
        }
        event.setStatus(Status.CANCELLED);
        this.updateEventOutputPort.update(event);
    }
}
