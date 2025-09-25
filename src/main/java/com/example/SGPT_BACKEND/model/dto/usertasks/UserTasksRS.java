package com.example.SGPT_BACKEND.model.dto.usertasks;

import com.example.SGPT_BACKEND.model.entities.Tasks;
import com.example.SGPT_BACKEND.model.entities.Users;

public class UserTasksRS {

    private Integer userTaskId;

    private Users idUser;

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

    public UserTasksRS(Integer userTaskId, Users idUser, Tasks idTask) {
        this.userTaskId = userTaskId;
        this.idUser = idUser;
        this.idTask = idTask;
    }

    public UserTasksRS() {
    }

}
