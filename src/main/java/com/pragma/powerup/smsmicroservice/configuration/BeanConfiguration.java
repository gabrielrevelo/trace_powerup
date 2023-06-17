package com.pragma.powerup.smsmicroservice.configuration;

import com.pragma.powerup.smsmicroservice.adapters.driven.mongo.adapter.TraceabilityMongoAdapter;
import com.pragma.powerup.smsmicroservice.adapters.driven.mongo.mapper.ITraceabilityEntityMapper;
import com.pragma.powerup.smsmicroservice.adapters.driven.mongo.repositories.ITraceabilityRepository;
import com.pragma.powerup.smsmicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.powerup.smsmicroservice.domain.spi.ITraceabilityPersistencePort;
import com.pragma.powerup.smsmicroservice.domain.usecase.TraceabilityUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;

    @Bean
    public ITraceabilityServicePort traceabilityServicePort() {
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }

    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort() {
        return new TraceabilityMongoAdapter(traceabilityRepository, traceabilityEntityMapper);
    }
}
