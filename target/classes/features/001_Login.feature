Feature:Login
  @happy
  Scenario: login with valid credentials
    Given I land on entry page
    When I click on city button
    Then I land on home page
    When I enter email, password and click on Sign in button