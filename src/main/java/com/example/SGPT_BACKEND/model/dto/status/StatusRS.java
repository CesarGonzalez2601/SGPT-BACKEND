package com.example.SGPT_BACKEND.model.dto.status;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class StatusRS {

    private Integer idStatus;

    private String statusName;

    private String status;

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StatusRS(Integer idStatus, String statusName, String status) {
        this.idStatus = idStatus;
        this.statusName = statusName;
        this.status = status;
    }

    public StatusRS() {
    }
}
