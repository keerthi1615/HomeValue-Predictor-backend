package com.homevalue.backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_submissions")
public class UserSubmission {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String userName;
    
    @Column(nullable = false)
    private String location;
    
    @Column(nullable = false)
    private String budget;
    
    @Column(nullable = false)
    private String size;
    
    @Column(nullable = false)
    private String type;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Column(nullable = false)
    private String submittedAt;

    // ✅ Default Constructor
    public UserSubmission() {
    }

    // ✅ Parameterized Constructor
    public UserSubmission(Long id, String userName, String location, String budget, String size, String type, String description, String submittedAt) {
        this.id = id;
        this.userName = userName;
        this.location = location;
        this.budget = budget;
        this.size = size;
        this.type = type;
        this.description = description;
        this.submittedAt = submittedAt;
    }

    // ✅ GETTERS & SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
    }
}
