Feature: Interact on posts feature

  User Story:
  As a user, I should be able to interact with employees on the posts.

  Accounts are: hr, marketing, helpdesk

  Background:For the scenarios in the feature file, user is expected to on portal page
    Given user is on the marketing portal page


  Scenario: make a comment other employees' posts (as marketing2 account)

    When user clicks to comment button
    And user writes the comment in the comment box
    And user clicks to send button
    Then user should see the own comment on the page
