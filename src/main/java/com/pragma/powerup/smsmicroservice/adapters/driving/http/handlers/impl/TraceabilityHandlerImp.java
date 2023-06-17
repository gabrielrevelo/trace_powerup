package com.pragma.powerup.smsmicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.smsmicroservice.adapters.driving.http.dto.TraceabilityDto;
import com.pragma.powerup.smsmicroservice.adapters.driving.http.handlers.ITraceabilityHandler;
import com.pragma.powerup.smsmicroservice.adapters.driving.http.mapper.ITraceabilityRequestMapper;
import com.pragma.powerup.smsmicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.powerup.smsmicroservice.domain.model.Traceability;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TraceabilityHandlerImp implements ITraceabilityHandler {

    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityRequestMapper traceabilityRequestMapper;

    @Override
    public void saveTraceability(TraceabilityDto traceabilityDto) {
        traceabilityServicePort.saveTraceability(traceabilityRequestMapper.toTraceability(traceabilityDto));
    }


    @Override
    public List<TraceabilityDto> getTraceabilityByIdClient(String idClient) {
        List<Traceability> list = traceabilityServicePort.getTraceabilityByIdClient(idClient);
        return traceabilityRequestMapper.toTraceabilityDtoList(list);
    }
}
