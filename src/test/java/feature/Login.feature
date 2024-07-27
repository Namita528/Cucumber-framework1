Feature: Login to Facebook
Keywords Summary: This test will verify Login related scenarios to facebook.com
Scenario: Login with invalid credentials
Given User navigated to Facebook.com
When user enters Username as "User1" and Password as "PASSWORD"
And user clicks on login button
Then login should be successful
