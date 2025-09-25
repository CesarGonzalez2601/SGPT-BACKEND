package com.example.SGPT_BACKEND.service.impl;

import com.example.SGPT_BACKEND.model.dto.Pagination;
import com.example.SGPT_BACKEND.model.dto.userprojects.UserProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.userprojects.UserProjectsRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.model.entities.Roles;
import com.example.SGPT_BACKEND.model.entities.UserProjects;
import com.example.SGPT_BACKEND.model.entities.Users;
import com.example.SGPT_BACKEND.model.mappers.IUserProjectsMapper;
import com.example.SGPT_BACKEND.model.mappers.IUsersMapper;
import com.example.SGPT_BACKEND.repository.IRolRepository;
import com.example.SGPT_BACKEND.repository.IUserProjectsRepository;
import com.example.SGPT_BACKEND.repository.IUserRepository;
import com.example.SGPT_BACKEND.service.interfaces.IUserProjetctsService;
import com.example.SGPT_BACKEND.service.interfaces.IUserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserProjectsService implements IUserProjetctsService {

    @Autowired
    public IUserProjectsRepository userProjectsRepository;
    @Autowired
    public IUserProjectsMapper userProjectsMapper;
    @Autowired
    public IRolRepository rolRepository;

    @Override
    public UserProjectsRS save(UserProjectsRQ entity) {
        UserProjects userProjects = userProjectsMapper.requestToEntity(entity);
        Roles rol = rolRepository.findById(entity.getIdRole().getIdRole()).orElseThrow(()-> new EntityNotFoundException("No se encontraron registros"));
        userProjects.setIdRole(rol);
        UserProjects savedUserProjects = userProjectsRepository.save(userProjects);
        return userProjectsMapper.entityToResponse(savedUserProjects);
    }

    @Override
    public UserProjectsRS getById(Integer integer) {

        UserProjects users = userProjectsRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));
        return userProjectsMapper.entityToResponse(users);

    }

    @Override
    public Pagination<UserProjectsRS> getAll(Integer pagina, Integer cantidadElementos, String filtro) {
        return null;
    }

    @Override
    public UserProjectsRS update(Integer integer, UserProjectsRQ entity) {
        UserProjects userProjects = userProjectsRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));

        UserProjects userProjectsUpdated = userProjectsMapper.update(entity, userProjects);

        return userProjectsMapper.entityToResponse(userProjectsUpdated);
    }

    @Override
    public UserProjectsRS deleteLogico(Integer integer) {
        return null;
    }

}
