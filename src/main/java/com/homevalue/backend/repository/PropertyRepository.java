package com.homevalue.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.homevalue.backend.model.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}