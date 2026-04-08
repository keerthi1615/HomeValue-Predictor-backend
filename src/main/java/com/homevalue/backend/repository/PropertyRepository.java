package com.homevalue.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.homevalue.backend.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}