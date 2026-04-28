package com.homevalue.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.homevalue.backend.model.Property;
import com.homevalue.backend.service.PropertyService;

@RestController
@CrossOrigin(origins = "*")
public class PropertyController {

    private final PropertyService service = new PropertyService();

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