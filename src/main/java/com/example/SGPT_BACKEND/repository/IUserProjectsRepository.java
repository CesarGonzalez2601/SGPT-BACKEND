package com.example.SGPT_BACKEND.repository;

import com.example.SGPT_BACKEND.model.entities.UserProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserProjectsRepository extends JpaRepository<UserProjects, Integer>{


}
