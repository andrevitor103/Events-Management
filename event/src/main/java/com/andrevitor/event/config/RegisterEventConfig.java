package com.andrevitor.event.config;

import com.andrevitor.event.adapters.out.RegisterEventAdapter;
import com.andrevitor.event.application.core.usecase.RegisterEventUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class RegisterEventConfig {
    @Bean
    public RegisterEventUseCase registerEventUseCase(RegisterEventAdapter registerEventAdapter) {
        return new RegisterEventUseCase(registerEventAdapter);
    }
}
