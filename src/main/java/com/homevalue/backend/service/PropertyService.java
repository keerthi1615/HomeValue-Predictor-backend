package com.homevalue.backend.service;

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
    }
}
