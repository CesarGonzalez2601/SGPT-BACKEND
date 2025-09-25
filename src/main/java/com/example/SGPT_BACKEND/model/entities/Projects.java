package com.example.SGPT_BACKEND.model.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Formula;

import java.time.LocalDateTime;

@Entity
@Table(name = "projects", schema = "gestion")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_project")
    private Integer idProject;

    @ManyToOne
    @JoinColumn(name = "id_owner_user")
    private Users idOwnerUser;

    @Column(name = "project")
    private String project;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "project_status")
    private Boolean projectStatus;


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

    public Projects(Integer idProject, Users idOwnerUser, String project, String description, LocalDateTime createdDate, Boolean projectStatus) {
        this.idProject = idProject;
        this.idOwnerUser = idOwnerUser;
        this.project = project;
        this.description = description;
        this.createdDate = createdDate;
        this.projectStatus = projectStatus;
    }

    public Projects() {
    }
}
