Feature: Google search
Scenario Outline: Simple search

Given I am on the google homepage
When I enter search "<term>"
And I click on google search button
Then I receive related search result

Examples:
|term              |
|quality assurance |
|software testing  |
