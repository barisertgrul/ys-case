Feature: Login attempt on yemeksepeti.com
@unhappy
Scenario: try login with wrong credentials
Given I land on entry page
When I click on city button
Then I land on home page
When I enter email, wrong password and click on Sign in button
Then I should see error popup
When I click on Ok button