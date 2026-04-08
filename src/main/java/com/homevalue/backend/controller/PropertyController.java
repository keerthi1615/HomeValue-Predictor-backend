package com.homevalue.backend.controller;
import com.homevalue.backend.model.Property;

import com.homevalue.backend.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyRepository repository;

    // GET ALL
    @GetMapping
    public List<Property> getAllProperties() {
        return repository.findAll();
    }

    // ADD PROPERTY
    @PostMapping
    public Property addProperty(@RequestBody Property property) {
        return repository.save(property);
    }

    // DELETE PROPERTY
    @DeleteMapping("/{id}")
    public String deleteProperty(@PathVariable Long id) {
        repository.deleteById(id);
        return "Deleted Successfully";
    }

    // ✅ RECOMMENDATIONS (IMPORTANT FOR YOUR PROJECT)
    @GetMapping("/recommend")
    public List<String> getRecommendations(@RequestParam double budget,
                                           @RequestParam double size) {

        List<String> suggestions = new java.util.ArrayList<>();

        if (budget > 4000000) {
            suggestions.add("Upgrade flooring to premium tiles");
            suggestions.add("Install modular kitchen");
        }

        if (size > 1000) {
            suggestions.add("Add garden or balcony");
        }

        suggestions.add("Use smart lighting system");
        suggestions.add("Add fresh paint");

        return suggestions;
    }
}