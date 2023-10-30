# Recipe Management System API

The Recipe Management System API allows users to store and manage recipes. Users can perform CRUD operations on recipes, add comments to recipes, and search for recipes based on keywords or ingredients.

## Frameworks and Technologies Used

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
  <a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
  
<a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
</a>
</p>

The Recipe Management System API project is developed using the Spring Framework, with Spring Boot as the primary framework for building the backend. The main language used for development is Java.

## Data Flow

### Controller

1.RecipeController: Handles CRUD operations for recipes, including adding, updating, deleting, and searching recipes.

### Services

1.RecipeService: Implements the logic for managing recipes, including adding, updating, and deleting recipes, and performing searches.

### Repository

1. IRecipeRepo: Extends JpaRepository for Recipe entity to perform database operations related to recipes.



## Database Design

The database consists of the following entities:

1. User: Represents user information, including name, email, password, and gender.

2. Recipe: Contains recipe details, such as name, ingredients, and instructions.

3. Comment: Stores comments made by users on specific recipes.

## Endpoints

### User Endpoints

- `POST /user/signup`: Register a new user with name, email, and password.
- `POST /user/signin`: Sign in a user with email and password to get an authentication token.
- `DELETE /user/signout`: Sign out a user and invalidate the authentication token.

### Recipe Endpoints

- `POST /recipe`: Add a new recipe (Requires authentication).
- `PUT /recipe/{recipeId}`: Update an existing recipe (Requires authentication and ownership).
- `DELETE /recipe/{recipeId}`: Delete a recipe (Requires authentication and ownership).
- `GET /recipe/{recipeId}`: Get a recipe by its ID (Requires authentication).
- `GET /search?keyword={keyword}`: Search for recipes by keyword (Requires authentication).

### Comment Endpoints

- `POST /comment`: Add a comment to a recipe (Requires authentication).
- `PUT /comment/{commentId}`: Update a comment (Requires authentication and ownership).
- `DELETE /comment/{commentId}`: Delete a comment (Requires authentication and ownership).
- `GET /comment?recipeId={recipeId}`: Get comments for a specific recipe (Requires authentication).

## Data Structure

1. User Entity:
   - userId (Auto-generated)
   - userName
   - gender

2. Recipe Entity:
   - recipeId (Auto-generated)
   - recipeName
   - recipeIngredients (List of strings)
   - recipeInstructions

## Project Summary

The Recipe Management System API allows users to manage their recipes. Users can add, update, and delete recipes, as well as search for recipes based on keywords or ingredients. Additionally, users can add comments to recipes to share their thoughts and experiences.

## How to Run the Application

1. Clone the repository to your local machine.
2. Configure the MySQL database and update the application.properties file with the database credentials.
3. Build and run the Spring Boot application.
4. The API will be accessible at `http://localhost:8080`.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please create a pull request or open an issue.

## Author

👤 **Kevin roland**

* GitHub: [officialkevin]( https://github.com/officialkevin)

    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome.
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
## 📝 License

Copyright © 2023 [officialkevin]( https://github.com/officialkevin).<br />
    
---
