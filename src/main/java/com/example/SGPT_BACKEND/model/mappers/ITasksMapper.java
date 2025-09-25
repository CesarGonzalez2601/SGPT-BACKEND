package com.example.SGPT_BACKEND.model.mappers;

import com.example.SGPT_BACKEND.model.dto.tasks.TasksRQ;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.Tasks;
import com.example.SGPT_BACKEND.model.entities.Users;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface ITasksMapper {

    ITasksMapper INSTANCE = Mappers.getMapper(ITasksMapper.class);

    TasksRS entityToResponse(Tasks tasks);

    List<TasksRS> entityListToResponseList(List<Tasks> tasksList);

    Tasks requestToEntity(TasksRQ tasksRQ);

    Tasks update(TasksRQ tasksRQ, @MappingTarget Tasks tasks);

}

