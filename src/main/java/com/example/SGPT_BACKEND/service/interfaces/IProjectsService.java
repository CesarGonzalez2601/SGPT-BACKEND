package com.example.SGPT_BACKEND.service.interfaces;

import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRS;
import com.example.SGPT_BACKEND.model.entities.Projects;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProjectsService extends ICrudGenericService<Projects, Integer, ProjectsRQ, ProjectsRS>{

    List<ProjectsRS> getByIdUser(Integer idLoguedUser);

}
