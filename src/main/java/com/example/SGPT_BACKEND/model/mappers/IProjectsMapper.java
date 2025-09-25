package com.example.SGPT_BACKEND.model.mappers;

import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRS;
import com.example.SGPT_BACKEND.model.entities.Projects;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface IProjectsMapper {

    IProjectsMapper INSTANCE = Mappers.getMapper(IProjectsMapper.class);

    ProjectsRS entityToResponse(Projects projects);

    List<ProjectsRS> entityListToResponseList(List<Projects> projectsList);

    Projects requestToEntity(ProjectsRQ projectsRQ);

    Projects update(ProjectsRQ projectsRQ, @MappingTarget Projects projects);

}

