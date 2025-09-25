package com.example.SGPT_BACKEND.model.mappers;

import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.Users;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface IUsersMapper {

    IUsersMapper INSTANCE = Mappers.getMapper(IUsersMapper.class);

    UsersRS entityToResponse(Users users);

    List<UsersRS> entityListToResponseList(List<Users> usersList);

    Users requestToEntity(UsersRQ usersRQ);

    Users update(UsersRQ usersRQ, @MappingTarget Users users);

}

