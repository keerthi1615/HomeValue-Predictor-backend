@echo off
echo ========================================
echo HomeValue Predictor - Quick Setup Script
echo ========================================
echo.

echo Step 1: Checking MySQL service...
sc query MySQL80 >nul 2>&1
if %errorlevel% neq 0 (
    echo ERROR: MySQL service not found. Please install MySQL first.
    pause
    exit /b 1
)

echo MySQL service is available.
echo.

echo Step 2: Please enter your MySQL credentials:
set /p MYSQL_USER="MySQL Username (default: root): "
if "%MYSQL_USER%"=="" set MYSQL_USER=root

set /p MYSQL_PASS="MySQL Password: "
if "%MYSQL_PASS%"=="" (
    echo ERROR: Password cannot be empty.
    pause
    exit /b 1
)

echo.
echo Step 3: Creating database...
mysql -u %MYSQL_USER% -p%MYSQL_PASS% -e "CREATE DATABASE IF NOT EXISTS homevalue_db;" 2>nul
if %errorlevel% neq 0 (
    echo ERROR: Failed to create database. Check your credentials.
    pause
    exit /b 1
)

echo Database created successfully.
echo.

echo Step 4: Updating application.properties...
powershell -Command "(Get-Content 'src\main\resources\application.properties') -replace 'YOUR_MYSQL_USERNAME', '%MYSQL_USER%' -replace 'YOUR_MYSQL_PASSWORD', '%MYSQL_PASS%' | Set-Content 'src\main\resources\application.properties'"

echo Configuration updated.
echo.

echo Step 5: Building and running backend...
call mvnw.cmd clean compile
if %errorlevel% neq 0 (
    echo ERROR: Build failed.
    pause
    exit /b 1
)

echo.
echo Setup complete! The backend should start automatically.
echo Frontend can be started with: npm start
echo.

call mvnw.cmd spring-boot:run