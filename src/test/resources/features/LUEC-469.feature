@LUEC-469
Feature: Default

	
	@LUEC-463
	Scenario: Automation 1TC-AC04-verify that clickable more button( "view comment", "copy link", "edit", "delete" and "create task")

		    Given user is on the marketing portal page
		    When user clicks to comment button
		    And user writes the comment in the comment box
		    And user clicks to send button
		    And user should see the own comment on the page
		    And user click the more button under the comment
		    And user clicks delete button
		    And user close the alert by click ok
		    Then user should see delete message on the page