package com.homevalue.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.homevalue.backend.model.Property;
import com.homevalue.backend.service.PropertyService;

@RestController
@RequestMapping("/properties")   // 🔥 IMPORTANT
@CrossOrigin(origins = "*")
public class PropertyController {

    @Autowired
    private PropertyService service;

    @GetMapping
    public List<Property> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Property add(@RequestBody Property p) {
        return service.add(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}