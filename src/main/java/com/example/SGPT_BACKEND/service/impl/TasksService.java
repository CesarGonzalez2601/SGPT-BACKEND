package com.example.SGPT_BACKEND.service.impl;

import com.example.SGPT_BACKEND.model.dto.Pagination;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRQ;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRS;
import com.example.SGPT_BACKEND.model.entities.*;
import com.example.SGPT_BACKEND.model.mappers.ITasksMapper;
import com.example.SGPT_BACKEND.repository.IProjectsRepository;
import com.example.SGPT_BACKEND.repository.IStatusRepository;
import com.example.SGPT_BACKEND.repository.ITasksRepository;
import com.example.SGPT_BACKEND.repository.IUserTasksRepository;
import com.example.SGPT_BACKEND.service.interfaces.ITasksService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TasksService implements ITasksService {

    @Autowired
    public ITasksRepository tasksRepository;
    @Autowired
    public ITasksRepository userRepository;
    @Autowired
    public ITasksMapper tasksMapper;
    @Autowired
    public IProjectsRepository projectsRepository;
    @Autowired
    public IStatusRepository statusRepository;
    @Autowired
    public IUserTasksRepository userTasksRepository;

    @Override
    public TasksRS save(TasksRQ entity) {

        Tasks tasks = tasksMapper.requestToEntity(entity);
        Projects projects= projectsRepository.findById(entity.getIdProjects().getIdProject())
                .orElseThrow(()-> new EntityNotFoundException("No se encontraron datos"));
        Status status = statusRepository.findById(entity.getStatus().getIdStatus())
                .orElseThrow(()-> new EntityNotFoundException("No se encontraron datos"));
        tasks.setIdProjects(projects);
        tasks.setStatus(status);
        Tasks tasksSaved = tasksRepository.save(tasks);
        return tasksMapper.entityToResponse(tasksSaved);
    }

    @Override
    public TasksRS getById(Integer integer) {

        Tasks tasks = tasksRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));
        return tasksMapper.entityToResponse(tasks);

    }

    @Override
    public Pagination<TasksRS> getAll(Integer pagina, Integer cantidadElementos, String filtro) {
        return null;
    }

    @Override
    public TasksRS update(Integer integer, TasksRQ entity) {
        Tasks projects = tasksRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));

        Tasks projectsUpdated = tasksMapper.update(entity, projects);

        return tasksMapper.entityToResponse(projectsUpdated);
    }

    @Override
    public TasksRS deleteLogico(Integer integer) {
        return null;
    }

    @Override
    public List<TasksRS> getByIdProject(Integer idProject) {

        List<Tasks> tasks = tasksRepository.findAllByIdProjectsIdProject(idProject);

        if (tasks.isEmpty()){
            throw new EntityNotFoundException("No se encontraron registros");
        }

        List<TasksRS> tasksRSList = tasksMapper.entityListToResponseList(tasks);

        for (TasksRS task : tasksRSList) {
            Users assigned = userTasksRepository
                    .findByIdTaskTasksAndIdTaskIdProjectsIdProject(task.getTasks(), idProject)
                    .map(UserTasks::getIdUser)   // objeto User completo
                    .orElse(null);             // si no hay, null

            task.setAssigment(assigned);
        }



        return tasksRSList;
    }
}
