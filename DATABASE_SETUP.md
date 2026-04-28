# MySQL Database Setup Guide for HomeValue Predictor

## Prerequisites
- MySQL Server installed and running
- MySQL Workbench or MySQL CLI
- Java 17+
- Maven

## Step 1: Create MySQL Database

### Option A: Using MySQL Workbench
1. Open MySQL Workbench
2. Connect to your local MySQL server
3. Open a new SQL tab
4. Copy and run the content from `database-setup.sql` file
5. Execute the script

### Option B: Using MySQL CLI
```bash
mysql -u root -p < database-setup.sql
```

### Option C: Manual Creation
```sql
CREATE DATABASE IF NOT EXISTS homevalue_db;
USE homevalue_db;

-- Create tables (see database-setup.sql for complete script)
```

## Step 2: Configure Backend

### Update application.properties
The file is already configured at: `src/main/resources/application.properties`

Default credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/homevalue_db
spring.datasource.username=root
spring.datasource.password=root
```

**If your MySQL credentials are different**, update these values in `application.properties`:
```properties
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

## Step 3: Build and Run Backend

```bash
# Navigate to backend folder
cd HomeValue-Predictor-backend-main

# Build with Maven
mvn clean install

# Run the application
mvn spring-boot:run
```

The backend should start on `http://localhost:8081`

## Step 4: Verify Database Connection

When the application starts, you should see logs like:
```
Hibernate: create table properties ...
Hibernate: create table recommendations ...
Hibernate: create table user_submissions ...
```

This means the tables are being created automatically by Hibernate.

## Step 5: Run Frontend

```bash
# Navigate to frontend folder
cd HomeValue-Predictor-frontend-main

# Install dependencies
npm install

# Start development server
npm start
```

The frontend will run on `http://localhost:3000`

## Database Tables

### properties
- id (BIGINT, Primary Key, Auto Increment)
- location (VARCHAR 255, Not Null)
- budget (VARCHAR 255, Not Null)
- size (VARCHAR 255, Not Null)
- type (VARCHAR 255, Not Null)
- image_url (VARCHAR 500)

### recommendations
- id (BIGINT, Primary Key, Auto Increment)
- title (VARCHAR 255, Not Null)
- description (LONGTEXT, Not Null)
- impact (VARCHAR 50, Not Null)

### user_submissions
- id (BIGINT, Primary Key, Auto Increment)
- user_name (VARCHAR 255, Not Null)
- location (VARCHAR 255, Not Null)
- budget (VARCHAR 255, Not Null)
- size (VARCHAR 255, Not Null)
- type (VARCHAR 255, Not Null)
- description (LONGTEXT)
- submitted_at (VARCHAR 255, Not Null)

## API Endpoints

### Properties
- `GET /properties` - Get all properties
- `POST /properties` - Add new property
- `DELETE /properties/{id}` - Delete property

### Recommendations
- `GET /recommendations` - Get all recommendations
- `POST /recommendations` - Add new recommendation
- `PUT /recommendations/{id}` - Update recommendation
- `DELETE /recommendations/{id}` - Delete recommendation

### User Submissions
- `GET /user-submissions` - Get all user submissions
- `POST /user-submissions` - Submit property details
- `GET /user-submissions/{id}` - Get specific submission
- `DELETE /user-submissions/{id}` - Delete submission

## Troubleshooting

### Connection refused error
```
ERROR - Connection refused to host: localhost:3306
```
**Solution:** Make sure MySQL is running
```bash
# Windows
net start MySQL80

# macOS
brew services start mysql

# Linux
sudo systemctl start mysql
```

### Access denied error
```
Access denied for user 'root'@'localhost'
```
**Solution:** Update credentials in `application.properties` with your MySQL password

### Database already exists warning
This is normal - Hibernate will update the schema as needed.

### Port already in use
If port 8081 is in use, you can change it in `application.properties`:
```properties
server.port=9001
```

## Key Features Implemented

✅ JPA/Hibernate ORM
✅ MySQL Database Integration
✅ Auto-generating tables
✅ Property management
✅ Recommendation curation
✅ User submission tracking
✅ CORS enabled for frontend
✅ Dependency injection with Spring

## Next Steps

1. Verify database tables in MySQL Workbench
2. Test API endpoints using Postman or curl
3. Run frontend and test the UI
4. Add more recommendations from admin dashboard
5. Test user submissions flow
