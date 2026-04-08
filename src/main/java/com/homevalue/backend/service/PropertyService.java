package com.homevalue.backend.service;
import com.homevalue.backend.model.Property;
import com.homevalue.backend.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository repository;

    public Property save(Property property) {
        return repository.save(property);
    }

    public List<Property> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}