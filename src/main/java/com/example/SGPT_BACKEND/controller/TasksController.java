package com.example.SGPT_BACKEND.controller;

import com.example.SGPT_BACKEND.model.dto.tasks.TasksRQ;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.service.interfaces.ITasksService;
import com.example.SGPT_BACKEND.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    public ITasksService tasksService;

    @PostMapping
    public ResponseEntity<TasksRS> save(@RequestBody TasksRQ entity) {
        return ResponseEntity.ok(tasksService.save(entity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TasksRS> getById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(tasksService.getById(id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<TasksRS> update(@Validated @PathVariable Integer id, @Validated @RequestBody TasksRQ tasksRQ) {
        return ResponseEntity.ok(tasksService.update(id,tasksRQ));
    }

    @GetMapping("/by-project/{idProject}")
    public ResponseEntity<List<TasksRS>> getByIdProjects(@PathVariable("idProject") Integer idProject) {
        return ResponseEntity.ok(tasksService.getByIdProject(idProject));
    }
    
}
