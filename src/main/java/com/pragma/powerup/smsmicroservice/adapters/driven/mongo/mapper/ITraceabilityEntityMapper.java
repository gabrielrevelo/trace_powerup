package com.pragma.powerup.smsmicroservice.adapters.driven.mongo.mapper;

import com.pragma.powerup.smsmicroservice.adapters.driven.mongo.entity.TraceabilityEntity;
import com.pragma.powerup.smsmicroservice.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityEntityMapper {
    TraceabilityEntity toEntity(Traceability traceability);

    Traceability toDomain(TraceabilityEntity traceabilityEntity);

    List<Traceability> toTraceabilityList(List<TraceabilityEntity> traceabilityEntityList);
}
