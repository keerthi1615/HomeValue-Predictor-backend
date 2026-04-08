package com.homevalue.backend.model;

import jakarta.persistence.*;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private String budget;
    private String size;
    private String type;
    private String imageUrl;

    public Long getId() { return id; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getBudget() { return budget; }
    public void setBudget(String budget) { this.budget = budget; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}