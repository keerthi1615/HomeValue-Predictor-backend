package com.homevalue.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homevalue.backend.model.Recommendation;
import com.homevalue.backend.repository.RecommendationRepository;

@Service
public class RecommendationService {

    @Autowired
    private RecommendationRepository repository;

    public List<Recommendation> getAll() {
        return repository.findAll();
    }

    public Recommendation add(Recommendation r) {
        return repository.save(r);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Recommendation update(Long id, Recommendation r) {
        if (repository.existsById(id)) {
            r.setId(id);
            return repository.save(r);
        }
        return null;
    }

    public Recommendation getById(Long id) {
        return repository.findById(id).orElse(null);
    }
}