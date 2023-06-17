package com.pragma.powerup.smsmicroservice.adapters.driving.http.controller;

import com.pragma.powerup.smsmicroservice.adapters.driving.http.dto.TraceabilityDto;
import com.pragma.powerup.smsmicroservice.adapters.driving.http.handlers.ITraceabilityHandler;
import com.pragma.powerup.smsmicroservice.configuration.Constants;
import com.pragma.powerup.smsmicroservice.configuration.response.SuccessfulApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trace")
@RequiredArgsConstructor
public class TraceabilityRestController {

    private final ITraceabilityHandler traceabilityHandler;

    @Operation(summary = "Traceability")
    @PostMapping()
    @SecurityRequirement(name = "jwt")
    public ResponseEntity<SuccessfulApiResponse<Void>> trace(@Valid @RequestBody TraceabilityDto traceabilityDto) {
        traceabilityHandler.saveTraceability(traceabilityDto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new SuccessfulApiResponse<>(Constants.TRACE_SAVE_MESSAGE));
    }

    @Operation(summary = "Traceability list")
    @GetMapping("/{idClient}")
    @SecurityRequirement(name = "jwt")
    public ResponseEntity<SuccessfulApiResponse<List<TraceabilityDto>>> traceList(@PathVariable String idClient) {
        List<TraceabilityDto> listDto = traceabilityHandler.getTraceabilityByIdClient(idClient);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new SuccessfulApiResponse<>(listDto));
    }
}
