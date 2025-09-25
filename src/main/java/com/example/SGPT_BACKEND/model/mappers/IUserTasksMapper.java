package com.example.SGPT_BACKEND.model.mappers;

import com.example.SGPT_BACKEND.model.dto.usertasks.UserTasksRQ;
import com.example.SGPT_BACKEND.model.dto.usertasks.UserTasksRS;
import com.example.SGPT_BACKEND.model.entities.UserTasks;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface IUserTasksMapper {

    IUserTasksMapper INSTANCE = Mappers.getMapper(IUserTasksMapper.class);

    UserTasksRS entityToResponse(UserTasks Usertasks);

    List<UserTasksRS> entityListToResponseList(List<UserTasks> userTasksList);

    UserTasks requestToEntity(UserTasksRQ userTasksRQ);

    UserTasks update(UserTasksRQ userTasksRQ, @MappingTarget UserTasks userTasks);

}

