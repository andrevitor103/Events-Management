package com.andrevitor.event.adapters.in.controller;

import com.andrevitor.event.adapters.in.controller.mapper.EventMapper;
import com.andrevitor.event.adapters.in.controller.reponse.EventResponse;
import com.andrevitor.event.application.ports.in.FindEventByIdInputPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/event")
public class EventController {
    private FindEventByIdInputPort findEventByIdInputPort;
    @GetMapping("/{id}")
    public ResponseEntity<EventResponse> findById(@PathVariable final String id) {
        var event = this.findEventByIdInputPort.find(id);
        var eventResponse = EventMapper.toEventResponse(event);
        return ResponseEntity.ok().body(eventResponse);
    }
}
