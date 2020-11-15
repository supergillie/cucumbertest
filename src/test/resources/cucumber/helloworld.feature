Feature: Setup project
In order to verify setup
as a developer
i want to view hello world

  Scenario: Execute hello world
    Given I have correct project
    When I write Hello World Cucumber test
    Then I should be able to run it an see "Hello World" printed on screen.