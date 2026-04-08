package com.homevalue.backend.service;

import java.util.ArrayList;
import java.util.List;

import com.homevalue.backend.model.Property;

public class PropertyService {

    private List<Property> list = new ArrayList<>();

    public List<Property> getAll() {
        return list;
    }

    public Property add(Property p) {
        list.add(p);
        return p;
    }

    public void delete(Long id) {
        list.removeIf(p -> p.getId().equals(id));
    }
}