-- MySQL Database Setup Script for HomeValue Predictor

-- Create Database
CREATE DATABASE IF NOT EXISTS homevalue_db;
USE homevalue_db;

-- Create Properties Table
CREATE TABLE IF NOT EXISTS properties (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    location VARCHAR(255) NOT NULL,
    budget VARCHAR(255) NOT NULL,
    size VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    image_url VARCHAR(500),
    UNIQUE KEY unique_property (location, budget, size)
);

-- Create Recommendations Table
CREATE TABLE IF NOT EXISTS recommendations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description LONGTEXT NOT NULL,
    impact VARCHAR(50) NOT NULL
);

-- Create User Submissions Table
CREATE TABLE IF NOT EXISTS user_submissions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    budget VARCHAR(255) NOT NULL,
    size VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    description LONGTEXT,
    submitted_at VARCHAR(255) NOT NULL
);

-- Insert Sample Data (Optional)
INSERT INTO properties (location, budget, size, type, image_url) VALUES 
('New York', '500000', '1500 sqft', 'Apartment', 'https://images.unsplash.com/photo-1568605114967-8130f3a36994');

INSERT INTO recommendations (title, description, impact) VALUES 
('Kitchen Renovation', 'Modern kitchen upgrades can increase property value by 10-15% and improve daily living experience', 'High'),
('Bathroom Remodeling', 'Updated bathrooms are a key selling point for buyers', 'High'),
('Fresh Paint & Landscaping', 'Curb appeal improvements create positive first impressions', 'Medium'),
('Energy Efficient Windows', 'Reduce energy costs and improve comfort', 'Medium'),
('New Flooring', 'Quality flooring enhances aesthetics and durability', 'Medium');
