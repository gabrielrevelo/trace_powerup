package com.pragma.powerup.smsmicroservice.domain.spi;

import com.pragma.powerup.smsmicroservice.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityPersistencePort {
    void saveTraceability(Traceability traceability);

    List<Traceability> getTraceabilityByIdClient(String idClient);
}
