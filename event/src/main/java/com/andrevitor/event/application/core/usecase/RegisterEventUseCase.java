package com.andrevitor.event.application.core.usecase;

import com.andrevitor.event.application.core.domain.Event;
import com.andrevitor.event.application.core.domain.Status;
import com.andrevitor.event.application.ports.out.RegisterEventOutputPort;
import org.jetbrains.annotations.NotNull;

public class RegisterEventUseCase {
    private final RegisterEventOutputPort registerEventOutputPort;

    public RegisterEventUseCase(RegisterEventOutputPort registerEventOutputPort) {
        this.registerEventOutputPort = registerEventOutputPort;
    }
    public void register(@NotNull Event event) {
        event.setStatus(Status.ACTIVE);
        this.registerEventOutputPort.register(event);
    }
}
