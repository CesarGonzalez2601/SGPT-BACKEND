package com.example.SGPT_BACKEND.repository;

import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer>{

    Users findByEmailAndPassword(String email, String password);

    @Query("SELECT u FROM Users u " +
            "JOIN UserProjects up ON up.idUser.idUser = u.idUser " +
            "WHERE up.projects.idProject = :idProject")
    List<Users> findAllByProject(@Param("idProject") Integer idProject);

}
