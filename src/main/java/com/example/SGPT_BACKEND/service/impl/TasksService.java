package com.example.SGPT_BACKEND.service.impl;

import com.example.SGPT_BACKEND.model.dto.Pagination;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRQ;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRS;
import com.example.SGPT_BACKEND.model.entities.Tasks;
import com.example.SGPT_BACKEND.model.mappers.ITasksMapper;
import com.example.SGPT_BACKEND.repository.ITasksRepository;
import com.example.SGPT_BACKEND.service.interfaces.ITasksService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TasksService implements ITasksService {

    @Autowired
    public ITasksRepository tasksRepository;
    @Autowired
    public ITasksRepository userRepository;
    @Autowired
    public ITasksMapper projectsMapper;

    @Override
    public TasksRS save(TasksRQ entity) {

        Tasks projects = projectsMapper.requestToEntity(entity);
        Tasks tasksSaved = tasksRepository.save(projects);
        return projectsMapper.entityToResponse(tasksSaved);
    }

    @Override
    public TasksRS getById(Integer integer) {

        Tasks tasks = tasksRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));
        return projectsMapper.entityToResponse(tasks);

    }

    @Override
    public Pagination<TasksRS> getAll(Integer pagina, Integer cantidadElementos, String filtro) {
        return null;
    }

    @Override
    public TasksRS update(Integer integer, TasksRQ entity) {
        Tasks projects = tasksRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));

        Tasks projectsUpdated = projectsMapper.update(entity, projects);

        return projectsMapper.entityToResponse(projectsUpdated);
    }

    @Override
    public TasksRS deleteLogico(Integer integer) {
        return null;
    }
}
