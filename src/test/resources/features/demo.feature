@LUEC-405
Feature: Default
		

	
	@LUEC-403
	Scenario: Automation 2TC-AC1- verify that make a comment other employees' posts
		    Given user is on the marketing portal page
		    When user clicks to comment button
		    And user writes the another comment in the comment box
		    And user clicks to send button
		    Then user should see the own another comment on the page	

	
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

	
	@LUEC-464
	Scenario: Automation 3TC-AC02/1 - verify make a like emoji other employees' posts
		    Given user is on the marketing portal page
		    When user clicks to like button
		    Then user should see the like emoji on the page	

	
	@LUEC-465
	Scenario: Automation 4TC-AC02/2 - verify send laugh emoji other employees' posts
		    Given user is on the marketing portal page
		    When user hover over the like button which is under the user's own comment
		    And user clicks the laugh emoji
		    Then user should see the laugh emoji on the page	

	
	@LUEC-466
	Scenario: Automation 5TC-AC03 - verify that user replay his/her own comment
		      Given user is on the marketing portal page
		      When user clicks to comment button
		      And user writes the comment in the comment box
		      And user clicks to send button
		      And user should see the own comment on the page
		      And user clicks the reply button
		      And users types the own reply
		      And user clicks to send button again
		      Then user should see the own comment on the page	

	
	@LUEC-467
	Scenario: Automation 6TC-AC05 - verify that see the reviewers' names and visit their profiles by clicking on reviewers' name
		      Given user is on the marketing portal page
		      When user clicks the reviewer's name
		      Then user should see reviewer's profile	

	
	@LUEC-468
	Scenario: Automation 7TC-AC06 -verify that clickable the Star icon.
		    Given user is on the marketing portal page
		    When user clicks the star icon
		    Then star icon's color should change to yellow