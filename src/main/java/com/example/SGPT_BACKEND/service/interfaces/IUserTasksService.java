package com.example.SGPT_BACKEND.service.interfaces;

import com.example.SGPT_BACKEND.model.dto.usertasks.UserTasksRQ;
import com.example.SGPT_BACKEND.model.dto.usertasks.UserTasksRS;
import com.example.SGPT_BACKEND.model.entities.UserTasks;
import org.springframework.stereotype.Service;

@Service
public interface IUserTasksService extends ICrudGenericService<UserTasks, Integer, UserTasksRQ, UserTasksRS>{

}
