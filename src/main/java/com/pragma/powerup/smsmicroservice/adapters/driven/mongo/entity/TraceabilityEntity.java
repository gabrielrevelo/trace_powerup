package com.pragma.powerup.smsmicroservice.adapters.driven.mongo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "traceability")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TraceabilityEntity {
    @Id
    private String id;
    @Field("id_order")
    private String idOrder;
    @Field("id_client")
    private String idClient;
    @Field("id_employee")
    private String idEmployee;
    @Field("date")
    private LocalDateTime date;
    @Field("new_status")
    private String newStatus;
    @Field("old_status")
    private String oldStatus;
}