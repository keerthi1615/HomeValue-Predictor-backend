package com.homevalue.backend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/properties")
public class PropertyController {

    // ✅ GET ALL (Dummy Data)
    @GetMapping
    public List<String> getAllProperties() {
        return List.of("House 1", "House 2", "House 3");
    }

    // ✅ ADD PROPERTY (Dummy)
    @PostMapping
    public String addProperty() {
        return "Property added successfully (dummy)";
    }

    // ✅ DELETE PROPERTY (Dummy)
    @DeleteMapping("/{id}")
    public String deleteProperty(@PathVariable Long id) {
        return "Deleted property with id: " + id;
    }

    // ✅ RECOMMENDATIONS
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