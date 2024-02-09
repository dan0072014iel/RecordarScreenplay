Feature: Comments

  @Getcomments
  Scenario: Retrieve comments successfully
    When the administrator consumes the GET endpoint for comments
    Then the comments should appear successfully