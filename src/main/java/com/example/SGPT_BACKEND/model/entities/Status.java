package com.example.SGPT_BACKEND.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "status", schema = "gestion")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_status")
    private Integer idStatus;

    @Column(name = "status_name")
    private String statusName;

    @Column(name = "status")
    private String status;

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Status(Integer idStatus, String status, String statusName) {
        this.idStatus = idStatus;
        this.status = status;
        this.statusName = statusName;
    }

    public Status() {
    }
}
