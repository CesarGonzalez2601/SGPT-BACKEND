package com.example.SGPT_BACKEND.repository;

import com.example.SGPT_BACKEND.model.entities.Tasks;
import com.example.SGPT_BACKEND.model.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITasksRepository extends JpaRepository<Tasks, Integer>{

 Integer countByIdProjectsIdProject(Integer idProyecto);

}
