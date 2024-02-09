Feature: Posts

  @Getpost
  Scenario: Retrieve posts successfully
    When the administrator consumes the GET endpoint for posts
    Then the posts should appear successfully

