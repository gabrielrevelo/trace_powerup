package com.pragma.powerup.smsmicroservice.adapters.driven.mongo.adapter;

import com.pragma.powerup.smsmicroservice.adapters.driven.mongo.entity.TraceabilityEntity;
import com.pragma.powerup.smsmicroservice.adapters.driven.mongo.mapper.ITraceabilityEntityMapper;
import com.pragma.powerup.smsmicroservice.adapters.driven.mongo.repositories.ITraceabilityRepository;
import com.pragma.powerup.smsmicroservice.domain.model.Traceability;
import com.pragma.powerup.smsmicroservice.domain.spi.ITraceabilityPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TraceabilityMongoAdapter implements ITraceabilityPersistencePort {
    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;

    @Override
    public void saveTraceability(Traceability traceability) {
        traceabilityRepository.save(traceabilityEntityMapper.toEntity(traceability));
    }

    @Override
    public List<Traceability> getTraceabilityByIdClient(String idClient) {
        List<TraceabilityEntity> list = traceabilityRepository.findAllByIdClient(idClient);
        return traceabilityEntityMapper.toTraceabilityList(list);
    }
}