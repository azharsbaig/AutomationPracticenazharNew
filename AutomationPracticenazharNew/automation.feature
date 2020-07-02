Feature: Automation Practice
description: Login
Scenario: Automation of Dress Selection
Given User is on automationPage
When User clicks on the account
And User write username and password and click on Submit
Then User is signed in
When User select dress
Then Dress selected
When User pay the price and logout
Then User Logout
