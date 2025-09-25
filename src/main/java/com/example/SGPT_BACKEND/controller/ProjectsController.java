package com.example.SGPT_BACKEND.controller;

import com.example.SGPT_BACKEND.model.dto.Pagination;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRS;
import com.example.SGPT_BACKEND.service.interfaces.IProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectsController {

    @Autowired
    public IProjectsService projectsService;

    @PostMapping
    public ResponseEntity<ProjectsRS> save(@RequestBody ProjectsRQ entity) {
        return ResponseEntity.ok(projectsService.save(entity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectsRS> getById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(projectsService.getById(id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectsRS> update(@Validated @PathVariable Integer id, @Validated @RequestBody ProjectsRQ projectsRQ) {
        return ResponseEntity.ok(projectsService.update(id,projectsRQ));
    }

    @GetMapping("/all-user/{idLoguedUser}")
    public ResponseEntity<List<ProjectsRS>> getAll(@PathVariable("idLoguedUser") Integer idLoguedUser) {
        return ResponseEntity.ok(projectsService.getByIdUser(idLoguedUser));
    }

}
