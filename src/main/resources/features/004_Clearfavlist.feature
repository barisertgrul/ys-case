Feature: clear favorites list feature on yemeksepeti.com
  Background: user should have logged in and added restaurant to favorites
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
    Given I land on restaurant detail page
    When I click on fav button
    Then I should see fav icon turn yellow
  @happy
  Scenario: select all restaurants and clear favorites list
    Given I land on  favorites page
    When I click on restaurants checkbox that I want to remove
    And I click on delete button
    Then I should see deleted text on screen

