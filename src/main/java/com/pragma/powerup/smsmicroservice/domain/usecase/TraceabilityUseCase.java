package com.pragma.powerup.smsmicroservice.domain.usecase;

import com.pragma.powerup.smsmicroservice.configuration.Constants;
import com.pragma.powerup.smsmicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.powerup.smsmicroservice.domain.model.Traceability;
import com.pragma.powerup.smsmicroservice.domain.spi.ITraceabilityPersistencePort;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TraceabilityUseCase implements ITraceabilityServicePort {

    private final ITraceabilityPersistencePort traceabilityPersistencePort;

    public TraceabilityUseCase(ITraceabilityPersistencePort traceabilityPersistencePort) {
        this.traceabilityPersistencePort = traceabilityPersistencePort;
    }

    @Override
    public void saveTraceability(Traceability traceability) {
        traceability.setDate(LocalDateTime.now());
        traceabilityPersistencePort.saveTraceability(traceability);
    }

    @Override
    public List<Traceability> getTraceabilityByIdClient(String idClient) {
        return traceabilityPersistencePort.getTraceabilityByIdClient(idClient);
    }
}
