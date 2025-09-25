package com.example.SGPT_BACKEND.service.interfaces;

import com.example.SGPT_BACKEND.model.dto.userprojects.UserProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.userprojects.UserProjectsRS;
import com.example.SGPT_BACKEND.model.entities.UserProjects;
import org.springframework.stereotype.Service;

@Service
public interface IUserProjetctsService extends ICrudGenericService<UserProjects, Integer, UserProjectsRQ, UserProjectsRS>{

}
