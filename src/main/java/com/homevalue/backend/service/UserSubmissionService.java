package com.homevalue.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homevalue.backend.model.UserSubmission;
import com.homevalue.backend.repository.UserSubmissionRepository;

@Service
public class UserSubmissionService {

    @Autowired
    private UserSubmissionRepository repository;

    public List<UserSubmission> getAll() {
        return repository.findAll();
    }

    public UserSubmission add(UserSubmission submission) {
        return repository.save(submission);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public UserSubmission getById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
