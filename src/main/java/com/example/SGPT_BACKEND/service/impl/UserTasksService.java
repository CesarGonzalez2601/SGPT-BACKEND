package com.example.SGPT_BACKEND.service.impl;

import com.example.SGPT_BACKEND.model.dto.Pagination;
import com.example.SGPT_BACKEND.model.dto.usertasks.UserTasksRQ;
import com.example.SGPT_BACKEND.model.dto.usertasks.UserTasksRS;
import com.example.SGPT_BACKEND.model.entities.UserTasks;
import com.example.SGPT_BACKEND.model.mappers.IUserTasksMapper;
import com.example.SGPT_BACKEND.repository.IUserTasksRepository;
import com.example.SGPT_BACKEND.service.interfaces.IUserTasksService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserTasksService implements IUserTasksService {

    @Autowired
    public IUserTasksRepository userTasksRepository;
    @Autowired
    public IUserTasksMapper userTasksMapper;

    @Override
    public UserTasksRS save(UserTasksRQ entity) {

        UserTasks userTasks = userTasksMapper.requestToEntity(entity);
        UserTasks tasksSaved = userTasksRepository.save(userTasks);
        return userTasksMapper.entityToResponse(tasksSaved);
    }

    @Override
    public UserTasksRS getById(Integer integer) {

        UserTasks userTasks = userTasksRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));
        return userTasksMapper.entityToResponse(userTasks);

    }

    @Override
    public Pagination<UserTasksRS> getAll(Integer pagina, Integer cantidadElementos, String filtro) {
        return null;
    }

    @Override
    public UserTasksRS update(Integer integer, UserTasksRQ entity) {
        UserTasks projects = userTasksRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));

        UserTasks projectsUpdated = userTasksMapper.update(entity, projects);

        return userTasksMapper.entityToResponse(projectsUpdated);
    }

    @Override
    public UserTasksRS deleteLogico(Integer integer) {

        UserTasks userTasks = userTasksRepository.findByIdTaskTasks(integer)
                .orElseThrow(()-> new EntityNotFoundException("No se encotró esta tarea"));

        userTasksRepository.delete(userTasks);

        return null;
    }
}
