# Transaction Management API

A backend system built using Java and Spring Boot to simulate financial transactions between users.

## Features
- Create users
- Transfer money between users
- Balance validation
- Transaction recording

## Tech Stack
- Java
- Spring Boot
- MySQL
- JPA / Hibernate
- Postman

## API Endpoints

### Create User
POST /users

### Get Users
GET /users

### Transfer Money
POST /transactions?senderId=1&receiverId=2&amount=200

## Sample Response
{
  "status": "SUCCESS",
  "message": "Transaction successful",
  "senderBalance": 300,
  "receiverBalance": 1200
}
