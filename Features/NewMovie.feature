Scenario: Add a New Movie
    Given the API is running
    When I add a new movie with title "New Movie", director "New Director", genre "Drama", and releaseDate "2024-01-01"
    Then the add movie response status should be 201
    And the response should contain a movieId