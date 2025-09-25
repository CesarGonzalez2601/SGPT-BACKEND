package com.example.SGPT_BACKEND.model.mappers;

import com.example.SGPT_BACKEND.model.dto.userprojects.UserProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.userprojects.UserProjectsRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.UserProjects;
import com.example.SGPT_BACKEND.model.entities.Users;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface IUserProjectsMapper {

    IUserProjectsMapper INSTANCE = Mappers.getMapper(IUserProjectsMapper.class);

    UserProjectsRS entityToResponse(UserProjects userProjects);

    List<UserProjectsRS> entityListToResponseList(List<UserProjects> userProjectsList);

    UserProjects requestToEntity(UserProjectsRQ usersProjectsRQ);

    UserProjects update(UserProjectsRQ usersProjectsRQ, @MappingTarget UserProjects userProjects);

}

