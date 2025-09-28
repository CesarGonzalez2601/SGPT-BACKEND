package com.example.SGPT_BACKEND.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_tasks", schema = "gestion")
public class UserTasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_tasks")
    private Integer userTaskId;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users idUser;

    @ManyToOne
    @JoinColumn(name = "id_task")
    private Tasks idTask;

    public Integer getUserTaskId() {
        return userTaskId;
    }

    public void setUserTaskId(Integer userTaskId) {
        this.userTaskId = userTaskId;
    }

    public Users getIdUser() {
        return idUser;
    }

    public void setIdUser(Users idUser) {
        this.idUser = idUser;
    }

    public Tasks getIdTask() {
        return idTask;
    }

    public void setIdTask(Tasks idTask) {
        this.idTask = idTask;
    }

    public UserTasks(Integer userTaskId, Users idUser, Tasks idTask) {
        this.userTaskId = userTaskId;
        this.idUser = idUser;
        this.idTask = idTask;
    }

    public UserTasks() {
    }
}
