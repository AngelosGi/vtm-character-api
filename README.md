# Vampire: The Masquerade Character API

## Description
This project is a Spring Boot-based REST API for managing Vampire: The Masquerade characters. It allows users to create, retrieve, update, and delete vampire characters, providing a robust backend for VTM-related applications.
This is a personal project to learn and to showcase multiple technologies.

## Features
- RESTful API for CRUD operations on Vampire: The Masquerade characters
- Character attributes, skills, disciplines, and other VTM-specific traits
- Clan and Predator Type enums
- Touchstones and Convictions support
- Blood Potency and Humanity tracking

## Technologies Used
- Java 17
- Spring Boot 3.3.3
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Swagger/OpenAPI for API documentation

## Setup and Installation
1. Clone the repository:
   ```
   git clone https://github.com/AngelosGi/vtm-character-api.git
   git clone git@github.com:AngelosGi/vtm-character-api.git
   ```
2. Navigate to the project directory:
   ```
   cd vtm-character-api
   ```
3. Ensure you have Java 17 and Maven installed.
4. Set up your PostgreSQL database and update the `application.properties` file with your database credentials.
5. Build the project:
   ```
   mvn clean install
   ```
6. Run the application:
   ```
   mvn spring-boot:run
   ```

The API will be available at `http://localhost:8080`.

## API Endpoints
- `POST /api/characters`: Create a new character
- `GET /api/characters`: Retrieve all characters
- `GET /api/characters/{id}`: Retrieve a specific character
- `PUT /api/characters/{id}`: Update a character
- `DELETE /api/characters/{id}`: Delete a character

For detailed API documentation, run the application and visit `http://localhost:8080/swagger-ui.html`.

## Data Model
The Character entity includes:
- Basic information (name, concept, clan, predator type, etc.)
- Attributes (Physical, Social, Mental)
- Skills (Physical, Social, Mental)
- Disciplines
- Touchstones and Convictions
- Other VTM-specific traits (Humanity, Blood Potency, etc.)

## Contributing
Contributions to this project are welcome. Please follow these steps:
1. Fork the repository
2. Create a new branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Acknowledgments
- White Wolf Publishing for creating Vampire: The Masquerade

## TODO
- Add security
- Add use cases
- a bit of a front end
- have a ready wiki though api, scrape info from vtm wiki.
- create CI/DI pipeline and deploy.
