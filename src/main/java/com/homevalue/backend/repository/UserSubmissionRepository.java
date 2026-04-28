package com.homevalue.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.homevalue.backend.model.UserSubmission;

@Repository
public interface UserSubmissionRepository extends JpaRepository<UserSubmission, Long> {
}
