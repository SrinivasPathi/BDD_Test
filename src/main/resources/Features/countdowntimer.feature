Feature: verify the Home page Scenarios
@smoketest
Scenario: Home Page with three Sliders only
		  	Given I open the URL
		   	When I click on Shop Menu
		   	And I click on Home menu button
		   	Then i should see the sliders count as 3    

@smoketest
Scenario: Home page with three Arrivals only 
		  	Given I open the URL
		   	When I click on Shop Menu
		   	And I click on Home menu button
		   	Then verify Home page must contains only 3 Arrivals  
   
@smoketest 
Scenario Outline: Home page - Images in Arrivals should navigate 
		  	Given I open the URL
		   	When I click on Shop Menu
		   	And I click on Home menu button
		    Then verify Home page must contains only 3 Arrivals
		    When I click on the image <imagename>
		    Then verify user navigate to next page where user can add that book to his basket
		Examples:   		
			|imagename|
			| "Selenium Ruby" |
			|"Thinking in HTML"|
			|"Mastering JavaScript" |
			
@smoketest 
Scenario Outline: Home page - Arrivals-Images-Description
		  	Given I open the URL
		   	When I click on Shop Menu
		   	And I click on Home menu button
		    Then verify Home page must contains only 3 Arrivals
		    When I click on the image <imagename>
		    Then verify user navigate to next page where user can add that book to his basket
		    When I click on Description tab
		    Then There should be a "<imagedescription>" regarding that book the user clicked on
   		
   		Examples:   		
			|imagename|imagedescription|
			| "Selenium Ruby" |The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver.|
			|"Thinking in HTML"|This book provides you with an intermediate knowledge of HTML.|
			|"Mastering JavaScript" |It would seem that everything that needs to be written about JavaScript has been written.|

@smoketest 
Scenario Outline: Home page - Arrivals-Images-Reviews
		  	Given I open the URL
		   	When I click on Shop Menu
		   	And I click on Home menu button
		    Then verify Home page must contains only 3 Arrivals
		    When I click on the image <imagename>
		    Then verify user navigate to next page where user can add that book to his basket
		    When I click on Review tab
		    Then There should be a Reviews regarding that book the user clicked on
   		
   		Examples:   		
			|imagename|
			| "Selenium Ruby" |
			|"Thinking in HTML"|
			|"Mastering JavaScript" |

		    