package com.andrevitor.event.application.core.usecase;

import com.andrevitor.event.application.core.domain.Event;
import com.andrevitor.event.application.core.domain.Status;
import com.andrevitor.event.application.ports.in.RegisterEventInputPort;
import com.andrevitor.event.application.ports.out.RegisterEventOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisterEventUseCase implements RegisterEventInputPort {
    private final RegisterEventOutputPort registerEventOutputPort;

    public RegisterEventUseCase(RegisterEventOutputPort registerEventOutputPort) {
        this.registerEventOutputPort = registerEventOutputPort;
    }
    public void register(Event event) {
        event.register();
        this.registerEventOutputPort.register(event);
    }
}
