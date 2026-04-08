package com.homevalue.backend.model;

public class Property {

    private Long id;
    private String location;
    private String budget;
    private String size;
    private String type;
    private String imageUrl;

    // ✅ Default Constructor
    public Property() {
    }

    // ✅ Parameterized Constructor
    public Property(Long id, String location, String budget, String size, String type, String imageUrl) {
        this.id = id;
        this.location = location;
        this.budget = budget;
        this.size = size;
        this.type = type;
        this.imageUrl = imageUrl;
    }

    // ✅ GETTERS & SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {   // 🔥 IMPORTANT (needed for delete)
        this.id = id;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {   // 🔥 IMPORTANT (for images)
        this.imageUrl = imageUrl;
    }
}