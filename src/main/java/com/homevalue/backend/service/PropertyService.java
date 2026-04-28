package com.homevalue.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homevalue.backend.model.Property;
import com.homevalue.backend.repository.PropertyRepository;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository repository;

    public List<Property> getAll() {
        return repository.findAll();
    }

    public Property add(Property p) {
        return repository.save(p);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Property getById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
