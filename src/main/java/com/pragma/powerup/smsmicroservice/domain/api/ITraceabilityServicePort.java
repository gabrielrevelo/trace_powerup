package com.pragma.powerup.smsmicroservice.domain.api;

import com.pragma.powerup.smsmicroservice.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityServicePort {
    void saveTraceability(Traceability traceability);

    List<Traceability> getTraceabilityByIdClient(String idClient);
}