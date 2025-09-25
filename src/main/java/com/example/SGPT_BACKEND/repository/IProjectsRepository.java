package com.example.SGPT_BACKEND.repository;

import com.example.SGPT_BACKEND.model.entities.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProjectsRepository extends JpaRepository<Projects, Integer> {

    @Query("SELECT p FROM Projects p " +
            "JOIN UserProjects up ON up.projects.idProject = p.idProject " +
            "WHERE up.idUser.idUser = :idUserLogued")
    List<Projects> findAllByIdUser(Integer idUserLogued);

}
