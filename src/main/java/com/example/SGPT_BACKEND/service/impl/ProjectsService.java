package com.example.SGPT_BACKEND.service.impl;

import com.example.SGPT_BACKEND.model.dto.Pagination;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRS;
import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.Users;
import com.example.SGPT_BACKEND.model.mappers.IProjectsMapper;
import com.example.SGPT_BACKEND.repository.IProjectsRepository;
import com.example.SGPT_BACKEND.repository.ITasksRepository;
import com.example.SGPT_BACKEND.repository.IUserRepository;
import com.example.SGPT_BACKEND.service.interfaces.IProjectsService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjectsService implements IProjectsService {

    @Autowired
    public IProjectsRepository projectsRepository;
    @Autowired
    public IUserRepository userRepository;
    @Autowired
    public IProjectsMapper projectsMapper;
    @Autowired
    ITasksRepository tasksRepository;

    @Override
    public ProjectsRS save(ProjectsRQ entity) {

        Projects projects = projectsMapper.requestToEntity(entity);
        Users users = userRepository.findById(entity.getIdOwnerUser().getIdUser())
                .orElseThrow(()-> new EntityNotFoundException("No se encontraron registros"));
        projects.setIdOwnerUser(users);
        Projects savedProject = projectsRepository.save(projects);
        return projectsMapper.entityToResponse(savedProject);
    }

    @Override
    public ProjectsRS getById(Integer integer) {

        Projects projects = projectsRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));
        return projectsMapper.entityToResponse(projects);

    }

    @Override
    public Pagination<ProjectsRS> getAll(Integer pagina, Integer cantidadElementos, String filtro) {
        return null;
    }

    @Override
    public ProjectsRS update(Integer integer, ProjectsRQ entity) {
        Projects projects = projectsRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));

        Projects projectsUpdated = projectsMapper.update(entity, projects);

        return projectsMapper.entityToResponse(projectsUpdated);
    }

    @Override
    public ProjectsRS deleteLogico(Integer integer) {
        return null;
    }

    @Override
    public List<ProjectsRS> getByIdUser(Integer idUserLog) {

        List<Projects> projectsList = projectsRepository.findAllByIdUser(idUserLog);

        if (projectsList.isEmpty()){
            throw new EntityNotFoundException("No se encontraron proyectos asignados");
        }

        List<ProjectsRS> projectsRSList = projectsMapper.entityListToResponseList(projectsList);
        projectsRSList.forEach(projectsRSListFor -> {
            Integer totalTasks = tasksRepository.countByIdProjectsIdProject(projectsRSListFor.getIdProject());
            projectsRSListFor.setTasksCount(String.valueOf(totalTasks));
        });

        return projectsRSList;
    }

}
