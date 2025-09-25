package com.example.SGPT_BACKEND.controller;

import com.example.SGPT_BACKEND.model.dto.usertasks.UserTasksRQ;
import com.example.SGPT_BACKEND.model.dto.usertasks.UserTasksRS;
import com.example.SGPT_BACKEND.service.interfaces.IUserTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users-tasks")
public class UserTasksController {

    @Autowired
    public IUserTasksService userTasksService;

    @PostMapping
    public ResponseEntity<UserTasksRS> save(@RequestBody UserTasksRQ entity) {
        return ResponseEntity.ok(userTasksService.save(entity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserTasksRS> getById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(userTasksService.getById(id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UserTasksRS> update(@Validated @PathVariable Integer id, @Validated @RequestBody UserTasksRQ tasksRQ) {
        return ResponseEntity.ok(userTasksService.update(id,tasksRQ));
    }
    
}
