package com.example.SGPT_BACKEND.model.dto.userprojects;

import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.Roles;
import com.example.SGPT_BACKEND.model.entities.Users;

public class UserProjectsRS {

    private Integer idUserProjects;

    private Users idUser;

    private Projects projects;

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

    public UserProjectsRS(Integer idUserProjects, Users idUser, Projects projects, Roles idRole) {
        this.idUserProjects = idUserProjects;
        this.idUser = idUser;
        this.projects = projects;
        this.idRole = idRole;
    }

    public UserProjectsRS() {
    }

}
