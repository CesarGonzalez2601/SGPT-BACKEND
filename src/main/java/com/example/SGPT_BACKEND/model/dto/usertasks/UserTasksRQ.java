package com.example.SGPT_BACKEND.model.dto.usertasks;

import com.example.SGPT_BACKEND.model.entities.Tasks;
import com.example.SGPT_BACKEND.model.entities.Users;

public class UserTasksRQ {


    private Users idUser;

    private Tasks idTask;

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

    public UserTasksRQ( Users idUser, Tasks idTask) {
        this.idUser = idUser;
        this.idTask = idTask;
    }

    public UserTasksRQ() {
    }

}
