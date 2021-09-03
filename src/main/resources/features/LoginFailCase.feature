Feature: Login Fail case on yemeksepeti.com
@failcase
Scenario: login fail case after sign in check wrong id
Given I land on entry page
When I click on city button
Then I land on home page
When I enter email, password and click on Sign in button