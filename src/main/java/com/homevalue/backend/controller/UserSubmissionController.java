package com.homevalue.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.homevalue.backend.model.UserSubmission;
import com.homevalue.backend.service.UserSubmissionService;

@RestController
@CrossOrigin(origins = "*")
public class UserSubmissionController {

    @Autowired
    private UserSubmissionService service;

    @GetMapping("/user-submissions")
    public List<UserSubmission> getAll() {
        return service.getAll();
    }

    @PostMapping("/user-submissions")
    public UserSubmission add(@RequestBody UserSubmission submission) {
        return service.add(submission);
    }

    @GetMapping("/user-submissions/{id}")
    public UserSubmission getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/user-submissions/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
