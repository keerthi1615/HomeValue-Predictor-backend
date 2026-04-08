package com.homevalue.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homevalue.backend.model.Property;
import com.homevalue.backend.repository.PropertyRepository;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository repo;

    public List<Property> getAll() {
        return repo.findAll();
    }

    public Property add(Property p) {
        return repo.save(p);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}