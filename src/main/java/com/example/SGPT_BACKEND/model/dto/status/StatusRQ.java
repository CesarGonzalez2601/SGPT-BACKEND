package com.example.SGPT_BACKEND.model.dto.status;

public class StatusRQ {

    private String statusName;

    private String status;

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

    public StatusRQ(String statusName, String status) {
        this.statusName = statusName;
        this.status = status;
    }

    public StatusRQ() {
    }
}

