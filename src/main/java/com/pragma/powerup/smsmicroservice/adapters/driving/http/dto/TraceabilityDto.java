package com.pragma.powerup.smsmicroservice.adapters.driving.http.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Schema(description = "Traceability DTO")
public class TraceabilityDto {
    private String idOrder;
    private String idClient;
    private String idEmployee;
    private LocalDateTime date;
    private String newStatus;
    private String oldStatus;
}
