package com.example.SGPT_BACKEND.controller;

import com.example.SGPT_BACKEND.model.dto.status.StatusRQ;
import com.example.SGPT_BACKEND.model.dto.status.StatusRS;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRQ;
import com.example.SGPT_BACKEND.model.dto.tasks.TasksRS;
import com.example.SGPT_BACKEND.service.interfaces.IStatusService;
import com.example.SGPT_BACKEND.service.interfaces.ITasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    public IStatusService statusService;

    @PostMapping
    public ResponseEntity<StatusRS> save(@RequestBody StatusRQ entity) {
        return ResponseEntity.ok(statusService.save(entity));
    }

}
