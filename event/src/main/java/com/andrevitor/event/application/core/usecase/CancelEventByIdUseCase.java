package com.andrevitor.event.application.core.usecase;

import com.andrevitor.event.application.ports.in.CancelEventByIdInputPort;
import com.andrevitor.event.application.ports.out.CancelEventByIdOutputPort;
import com.andrevitor.event.application.ports.out.FindEventByIdOutputPort;

public class CancelEventByIdUseCase implements CancelEventByIdInputPort {

    private final FindEventByIdOutputPort findEventByIdOutputPort;
    private final CancelEventByIdOutputPort cancelEventByIdOutputPort;
    public CancelEventByIdUseCase(FindEventByIdOutputPort findEventByIdOutputPort, CancelEventByIdOutputPort cancelEventByIdOutputPort) {
        this.findEventByIdOutputPort = findEventByIdOutputPort;
        this.cancelEventByIdOutputPort = cancelEventByIdOutputPort;
    }
    @Override
    public void cancel(String id) {
        var event = this.findEventByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Event not found"));
        event.cancel();
        System.out.println(event);
        this.cancelEventByIdOutputPort.cancel(event);
    }
}
