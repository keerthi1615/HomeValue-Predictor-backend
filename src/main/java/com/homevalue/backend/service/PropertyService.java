package com.homevalue.backend.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.homevalue.backend.model.Property;

@Service
public class PropertyService {

    private List<Property> properties = new ArrayList<>();

    public PropertyService() {
        // dummy data
        Property p = new Property();
        p.setId(1L);
        p.setLocation("Hyderabad");
        p.setBudget("5000000");
        p.setSize("1200");
        p.setType("2BHK");
        p.setImageUrl("https://images.unsplash.com/photo-1568605114967-8130f3a36994");

        properties.add(p);
    }

    public List<Property> getAll() {
        return properties;
    }

    public Property add(Property p) {
        p.setId((long) (properties.size() + 1));
        properties.add(p);
        return p;
    }

    public void delete(Long id) {
        properties.removeIf(p -> p.getId().equals(id));
    }
}