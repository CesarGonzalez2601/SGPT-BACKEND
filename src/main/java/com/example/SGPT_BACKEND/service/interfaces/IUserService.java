package com.example.SGPT_BACKEND.service.interfaces;

import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService extends ICrudGenericService<Users, Integer, UsersRQ, UsersRS>{

    UsersRS getByLogin(UsersRQ usersRQ);

    List<UsersRS> getByAll();

    List<UsersRS> getByAllByProject(Integer idProject);
}
