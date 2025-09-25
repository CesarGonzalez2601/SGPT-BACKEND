package com.example.SGPT_BACKEND.model.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks", schema = "gestion")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tasks")
    private Integer tasks;

    @ManyToOne
    @JoinColumn(name = "id_project")
    private Projects idProjects;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private Status status;

    @Column(name = "description")
    private String description;

    @Column(name = "planned_start_date")
    private LocalDateTime plannedStartDate;

    @Column(name = "planned_end_date")
    private LocalDateTime plannedEndDate;

    public Integer getTasks() {
        return tasks;
    }

    public void setTasks(Integer tasks) {
        this.tasks = tasks;
    }

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


    public Tasks(Integer tasks, Projects idProjects, String name, Status status, String description, LocalDateTime plannedStartDate, LocalDateTime plannedEndDate) {
        this.tasks = tasks;
        this.idProjects = idProjects;
        this.name = name;
        this.status = status;
        this.description = description;
        this.plannedStartDate = plannedStartDate;
        this.plannedEndDate = plannedEndDate;
    }

    public Tasks() {
    }
}
