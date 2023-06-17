package com.pragma.powerup.smsmicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.smsmicroservice.adapters.driving.http.dto.TraceabilityDto;
import com.pragma.powerup.smsmicroservice.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityRequestMapper {
    Traceability toTraceability(TraceabilityDto traceabilityDto);

    TraceabilityDto toTraceabilityDto(Traceability traceability);

    List<TraceabilityDto> toTraceabilityDtoList(List<Traceability> traceabilityList);
}
