package com.example.SGPT_BACKEND.service.interfaces;

import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRS;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRQ;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRS;
import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.Tasks;
import org.springframework.stereotype.Service;

@Service
public interface ITasksService extends ICrudGenericService<Tasks, Integer, TasksRQ, TasksRS>{

}
