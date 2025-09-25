package com.example.SGPT_BACKEND.model.dto.tasks;


import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class TasksRQ {

    private Projects idProjects;

    private String name;

    private Status status;

    private String description;

    private LocalDateTime plannedStartDate;

    private LocalDateTime plannedEndDate;

    public Projects getIdProjects() {
        return idProjects;
    }

    public void setIdProjects(Projects idProjects) {
        this.idProjects = idProjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPlannedStartDate() {
        return plannedStartDate;
    }

    public void setPlannedStartDate(LocalDateTime plannedStartDate) {
        this.plannedStartDate = plannedStartDate;
    }

    public LocalDateTime getPlannedEndDate() {
        return plannedEndDate;
    }

    public void setPlannedEndDate(LocalDateTime plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
    }


    public TasksRQ( Projects idProjects, String name, Status status, String description, LocalDateTime plannedStartDate, LocalDateTime plannedEndDate) {
        this.idProjects = idProjects;
        this.name = name;
        this.status = status;
        this.description = description;
        this.plannedStartDate = plannedStartDate;
        this.plannedEndDate = plannedEndDate;
    }

    public TasksRQ() {
    }
}
