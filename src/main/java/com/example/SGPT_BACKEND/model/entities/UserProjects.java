package com.example.SGPT_BACKEND.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_projects", schema = "gestion")
public class UserProjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_projects")
    private Integer idUserProjects;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users idUser;

    @ManyToOne
    @JoinColumn(name = "id_project")
    private Projects projects;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private Roles idRole;

    public Integer getIdUserProjects() {
        return idUserProjects;
    }

    public void setIdUserProjects(Integer idUserProjects) {
        this.idUserProjects = idUserProjects;
    }

    public Users getIdUser() {
        return idUser;
    }

    public void setIdUser(Users idUser) {
        this.idUser = idUser;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public Roles getIdRole() {
        return idRole;
    }

    public void setIdRole(Roles idRole) {
        this.idRole = idRole;
    }

    public UserProjects(Integer idUserProjects, Users idUser, Projects projects, Roles idRole) {
        this.idUserProjects = idUserProjects;
        this.idUser = idUser;
        this.projects = projects;
        this.idRole = idRole;
    }

    public UserProjects() {
    }

}
