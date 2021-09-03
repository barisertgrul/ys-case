Feature: add to favorite feature on yemeksepeti.com
  Background: user should have logged in and searched restaurant
    Given I land on entry page
    When I click on city button
    Then I land on home page
    When I enter email, password and click on Sign in button
    Given I land on home page
    When I click to select region
    And I enter region name
    And I click on region
    And I close banabi banners
    When I enter text on search box
    And I click on search button
    Then I should see search results
    When I click on first restaurant of results
  @happy
  Scenario: adding restaurant to fav list
    Given I land on restaurant detail page
    When I click on fav button
    Then I should see fav icon turn yellow
