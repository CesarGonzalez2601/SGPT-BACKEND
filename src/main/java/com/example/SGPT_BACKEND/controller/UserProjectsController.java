package com.example.SGPT_BACKEND.controller;

import com.example.SGPT_BACKEND.model.dto.userprojects.UserProjectsRQ;
import com.example.SGPT_BACKEND.model.dto.userprojects.UserProjectsRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.service.interfaces.IUserProjetctsService;
import com.example.SGPT_BACKEND.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users-projects")
public class UserProjectsController {

    @Autowired
    public IUserProjetctsService userProjectsService;

    @PostMapping
    public ResponseEntity<UserProjectsRS> save(@RequestBody UserProjectsRQ entity) {
        return ResponseEntity.ok(userProjectsService.save(entity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProjectsRS> getById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(userProjectsService.getById(id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UserProjectsRS> update(@Validated @PathVariable Integer id, @Validated @RequestBody UserProjectsRQ usersProjectsRQ) {
        return ResponseEntity.ok(userProjectsService.update(id,usersProjectsRQ));
    }

}
