package com.andrevitor.event.adapters.in.controller;

import com.andrevitor.event.adapters.in.controller.mapper.EventMapper;
import com.andrevitor.event.adapters.in.controller.request.EventRequest;
import com.andrevitor.event.application.ports.in.RegisterEventInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/v1/event")
public class EventController {
    @Autowired
    private RegisterEventInputPort registerEventInputPort;
    @Autowired
    private EventMapper eventMapper;
    @PostMapping("/")
    public ResponseEntity<Void> register(@Validated @RequestBody EventRequest eventRequest) {
        var event = this.eventMapper.toEvent(eventRequest);
        this.registerEventInputPort.register(event);
        return ResponseEntity.noContent().build();
    }
}
