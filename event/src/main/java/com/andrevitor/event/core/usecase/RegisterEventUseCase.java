package com.andrevitor.event.core.usecase;

import com.andrevitor.event.core.domain.Event;
import com.andrevitor.event.core.domain.Status;
import com.andrevitor.event.ports.out.RegisterEventOutputPort;

public class RegisterEventUseCase {
    private final RegisterEventOutputPort registerEventOutputPort;

    public RegisterEventUseCase(RegisterEventOutputPort registerEventOutputPort) {
        this.registerEventOutputPort = registerEventOutputPort;
    }
    public void register(Event event) {
        event.setStatus(Status.ACTIVE);
        this.registerEventOutputPort.register(event);
    }
}
