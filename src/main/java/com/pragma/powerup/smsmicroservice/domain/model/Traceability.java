package com.pragma.powerup.smsmicroservice.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Traceability {
    private String id;
    private String idOrder;
    private String idClient;
    private String idEmployee;
    private LocalDateTime date;
    private String newStatus;
    private String oldStatus;

    public Traceability() {
    }

    public Traceability(String id, String idOrder, String idClient, String idEmployee, LocalDateTime date, String newStatus, String oldStatus) {
        this.id = id;
        this.idOrder = idOrder;
        this.idClient = idClient;
        this.idEmployee = idEmployee;
        this.date = date;
        this.newStatus = newStatus;
        this.oldStatus = oldStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
    }
}