package com.example.SGPT_BACKEND.controller;

import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.projects.ProjectsRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.service.interfaces.IProjectsService;
import com.example.SGPT_BACKEND.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    public IUserService userService;

    @PostMapping
    public ResponseEntity<UsersRS> save(@RequestBody UsersRQ entity) {
        return ResponseEntity.ok(userService.save(entity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsersRS> getById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(userService.getById(id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UsersRS> update(@Validated @PathVariable Integer id, @Validated @RequestBody UsersRQ usersRQ) {
        return ResponseEntity.ok(userService.update(id,usersRQ));
    }

    @PostMapping("/login")
    public ResponseEntity<UsersRS> login(@RequestBody UsersRQ entity) {
        return ResponseEntity.ok(userService.getByLogin(entity));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UsersRS>> getByAll() {
        return ResponseEntity.ok(userService.getByAll());
    }

    @GetMapping("/project/{idProject}")
    public ResponseEntity<List<UsersRS>> getByAllByProjectl(@PathVariable("idProject") Integer idProject) {
        return ResponseEntity.ok(userService.getByAllByProject(idProject));
    }

}
