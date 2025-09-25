package com.example.SGPT_BACKEND.model.dto.projects;

import com.example.SGPT_BACKEND.model.entities.Users;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;


public class ProjectsRQ {

    @NotNull(message = "El DUI del consultor no puede ser vacío")
    private Users idOwnerUser;


    @NotNull(message = "El DUI del consultor no puede ser vacío")
    private String project;


    @NotNull(message = "El DUI del consultor no puede ser vacío")
    private String description;

    @NotNull(message = "El DUI del consultor no puede ser vacío")
    private LocalDateTime createdDate;

    @NotNull(message = "El DUI del consultor no puede ser vacío")
    private Boolean projectStatus;

    public @NotNull(message = "El DUI del consultor no puede ser vacío") Users getIdOwnerUser() {
        return idOwnerUser;
    }

    public void setIdOwnerUser(@NotNull(message = "El DUI del consultor no puede ser vacío") Users idOwnerUser) {
        this.idOwnerUser = idOwnerUser;
    }

    public @NotNull(message = "El DUI del consultor no puede ser vacío") String getProject() {
        return project;
    }

    public void setProject(@NotNull(message = "El DUI del consultor no puede ser vacío") String project) {
        this.project = project;
    }

    public @NotNull(message = "El DUI del consultor no puede ser vacío") String getDescription() {
        return description;
    }

    public void setDescription(@NotNull(message = "El DUI del consultor no puede ser vacío") String description) {
        this.description = description;
    }

    public @NotNull(message = "El DUI del consultor no puede ser vacío") LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(@NotNull(message = "El DUI del consultor no puede ser vacío") LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public @NotNull(message = "El DUI del consultor no puede ser vacío") Boolean getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(@NotNull(message = "El DUI del consultor no puede ser vacío") Boolean projectStatus) {
        this.projectStatus = projectStatus;
    }
}
