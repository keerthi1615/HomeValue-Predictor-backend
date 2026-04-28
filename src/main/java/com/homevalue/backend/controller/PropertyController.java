package com.homevalue.backend.controller;

import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> 1a8139f734c85ba714919341090303e85006d851
import org.springframework.web.bind.annotation.*;

import com.homevalue.backend.model.Property;
import com.homevalue.backend.service.PropertyService;

@RestController
@CrossOrigin(origins = "*")
public class PropertyController {

<<<<<<< HEAD
    @Autowired
    private PropertyService service;
=======
    private final PropertyService service = new PropertyService();
>>>>>>> 1a8139f734c85ba714919341090303e85006d851

    @GetMapping("/properties")
    public List<Property> getAll() {
        return service.getAll();
    }

    @PostMapping("/properties")
    public Property add(@RequestBody Property p) {
        return service.add(p);
    }

    @DeleteMapping("/properties/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}