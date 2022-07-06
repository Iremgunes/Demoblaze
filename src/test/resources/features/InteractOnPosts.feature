Feature: Interact on posts feature

  User Story:
  As a user, I should be able to interact with employees on the posts.

  Accounts are: hr, marketing, helpdesk

  Background:For the scenarios in the feature file, user is expected to on portal page

    @AC01
  Scenario: As a user, user make a comment other employees' posts (as marketing2 account)
    Given user is on the marketing portal page
    When user clicks to comment button
    And user writes the comment in the comment box
    And user clicks to send button
    Then user should see the own comment on the page

  @AC02/1
  Scenario: As a user, user make a like other employees' posts (as marketing2 account)
    Given user is on the marketing portal page
    When user clicks to like button
    Then user should see the like emoji on the page

  @AC02/2
  Scenario: As a user, user send laugh emoji other employees' posts (as marketing2 account)
    Given user is on the marketing portal page
    When user hover over the like button which is under the user's own comment
    And user clicks the laugh emoji
    Then user should see the laugh emoji on the page

    @AC03
  Scenario: As a user, user replay his/her own comment.
      Given user is on the marketing portal page
      When user clicks to comment button
      And user writes the comment in the comment box
      And user clicks to send button
      And user should see the own comment on the page
      And user clicks the reply button
      And users types the own reply
      And user clicks to send button again
      Then user should see the own comment on the page

  @AC04
  Scenario: As a user, user should be able to "view comment", "copy link", "edit", "delete" and "create task" by clicking more(delete)
    Given user is on the marketing portal page
    When user clicks to comment button
    And user writes the comment in the comment box
    And user clicks to send button
    And user should see the own comment on the page
    And user click the more button under the comment
    And user clicks delete button
    And user close the alert by click ok
    Then user should see delete message on the page

    @AC05
    Scenario: As a user, user should be able to see the reviewers' names and visit their profiles by clicking on reviewers' name
      Given user is on the marketing portal page
      When user clicks the reviewer's name
      Then user should see reviewer's profile













