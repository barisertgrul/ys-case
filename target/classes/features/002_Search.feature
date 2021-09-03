Feature: search function on yemeksepeti.com

  Background: user should have logged in
    Given I land on entry page
    When I click on city button
    Then I land on home page
    When I enter email, password and click on Sign in button
  @happy
  Scenario: Search for restaurant on yemeksepeti.com without address
    Given I land on home page
    When I click to select region
    And I enter region name
    And I click on region
    And I close banabi banners
    When I enter text on search box
    And I click on search button
    Then I should see search results
    When I click on first restaurant of results

