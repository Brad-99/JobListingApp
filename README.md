# Job Listing Application

The Job Listing Application is a web-based platform that allows users to view, search, and post job listings. It consists of a React frontend for the user interface and a Spring Boot backend with MongoDB for data storage.

## Features

- **Job Listings:** View a list of job postings.
- **Search:** Search for job listings based on specific criteria.
- **Post a Job:** Users can add new job listings.

## Technologies Used

- **Frontend:** React
- **Backend:** Spring Boot
- **Database:** MongoDB
- **API Documentation:** Swagger

## Getting Started

### Prerequisites

- Node.js and npm (for React frontend)
- Java 17 (for Spring Boot backend)
- MongoDB (Make sure MongoDB is running and accessible)

### Setup

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/your-username/joblisting.git
   cd job-listing-application
   ```

2. **Frontend Setup:**

   ```bash
   cd frontend
   npm install
   npm start
   ```

3. **Backend Setup:**

   ```bash
   cd backend
   ./mvnw spring-boot:run
   ```

4. **Access the Application:**
   - Frontend: Open [http://localhost:3000](http://localhost:3000) in your browser.
   - Backend (Swagger UI): Open [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) for API documentation.

## API Endpoints

- **GET /allPosts:** Retrieve all job listings.
- **POST /post:** Add a new job listing.
- **GET /posts/{text}:** Search for job listings based on text criteria.

## License

This project is licensed under the MIT License
