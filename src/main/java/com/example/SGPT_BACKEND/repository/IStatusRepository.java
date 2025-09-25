package com.example.SGPT_BACKEND.repository;

import com.example.SGPT_BACKEND.model.entities.Projects;
import com.example.SGPT_BACKEND.model.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStatusRepository extends JpaRepository<Status, Integer> {

}
