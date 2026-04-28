package com.homevalue.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.homevalue.backend.model.Recommendation;
import com.homevalue.backend.service.RecommendationService;

@RestController
@CrossOrigin(origins = "*")
public class RecommendationController {

    @Autowired
    private RecommendationService service;

    @GetMapping("/recommendations")
    public List<Recommendation> getAll() {
        return service.getAll();
    }

    @PostMapping("/recommendations")
    public Recommendation add(@RequestBody Recommendation r) {
        return service.add(r);
    }

    @DeleteMapping("/recommendations/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/recommendations/{id}")
    public Recommendation update(@PathVariable Long id, @RequestBody Recommendation r) {
        return service.update(id, r);
    }
}