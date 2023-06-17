package com.pragma.powerup.smsmicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.smsmicroservice.adapters.driving.http.dto.TraceabilityDto;

import java.util.List;

public interface ITraceabilityHandler {
    void saveTraceability(TraceabilityDto traceabilityDto);

    List<TraceabilityDto> getTraceabilityByIdClient(String idClient);
}
