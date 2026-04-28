package com.homevalue.backend.service;

<<<<<<< HEAD
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
=======
import java.util.ArrayList;
import java.util.List;

import com.homevalue.backend.model.Property;

public class PropertyService {

    private List<Property> list = new ArrayList<>();
    private Long counter = 1L;

    public List<Property> getAll() {
        return list;
    }

    public Property add(Property p) {
        p.setId(counter++); // ✅ FIX
        list.add(p);
        return p;
    }

    public void delete(Long id) {
        list.removeIf(p -> p.getId() != null && p.getId().equals(id)); // ✅ FIX
>>>>>>> 1a8139f734c85ba714919341090303e85006d851
    }
}
