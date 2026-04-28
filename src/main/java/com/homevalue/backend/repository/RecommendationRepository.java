package com.homevalue.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.homevalue.backend.model.Recommendation;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
}
