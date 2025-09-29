package com.example.SGPT_BACKEND.model.mappers;

import com.example.SGPT_BACKEND.model.dto.status.StatusRQ;
import com.example.SGPT_BACKEND.model.dto.status.StatusRS;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRQ;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRS;
import com.example.SGPT_BACKEND.model.entities.Status;
import com.example.SGPT_BACKEND.model.entities.Tasks;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface IStatusMapper {

    IStatusMapper INSTANCE = Mappers.getMapper(IStatusMapper.class);

    StatusRS entityToResponse(Status status);

    List<StatusRS> entityListToResponseList(List<Status> statusList);

    Status requestToEntity(StatusRQ tasksRQ);

    Status update(StatusRQ statusRQ, @MappingTarget Status status);

}

