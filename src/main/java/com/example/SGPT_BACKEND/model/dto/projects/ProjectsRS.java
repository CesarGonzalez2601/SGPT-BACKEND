package com.example.SGPT_BACKEND.model.dto.projects;

import com.example.SGPT_BACKEND.model.entities.Users;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Formula;

import java.time.LocalDateTime;

public class ProjectsRS{

    private Integer idProject;

    private Users idOwnerUser;

    private String project;

    private String description;

    private LocalDateTime createdDate;

    private Boolean projectStatus;

    private String tasksCount;

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    public Users getIdOwnerUser() {
        return idOwnerUser;
    }

    public void setIdOwnerUser(Users idOwnerUser) {
        this.idOwnerUser = idOwnerUser;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Boolean projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getTasksCount() {
        return tasksCount;
    }

    public void setTasksCount(String tasksCount) {
        this.tasksCount = tasksCount;
    }

    public ProjectsRS(Integer idProject, Users idOwnerUser, String project, String description, LocalDateTime createdDate, Boolean projectStatus, String tasksCount) {
        this.idProject = idProject;
        this.idOwnerUser = idOwnerUser;
        this.project = project;
        this.description = description;
        this.createdDate = createdDate;
        this.projectStatus = projectStatus;
        this.tasksCount = tasksCount;
    }

    public ProjectsRS() {
    }

}
