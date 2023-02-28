package com.andrevitor.event.config;

import com.andrevitor.event.adapters.out.CancelEventByIdAdapter;
import com.andrevitor.event.adapters.out.FindEventByIdAdapter;
import com.andrevitor.event.application.core.usecase.CancelEventByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CancelEventByIdConfig {
    @Bean
    public CancelEventByIdUseCase cancelEventByIdUseCase(FindEventByIdAdapter findEventByIdAdapter, CancelEventByIdAdapter cancelEventByIdAdapter) {
        return new CancelEventByIdUseCase(findEventByIdAdapter, cancelEventByIdAdapter);
    }
}
