Feature: Test user signin feature
  Background: User opens website
    When User opens the website

  Scenario: Verify the user can able to signin sucessfull
    When User clicks sign in link and redirects to sign in page
    Then User enters email id "batmansubscription+1@gmail.com"
    Then User enters password "Batman@123"
    And User clicks sigin button
    Then User redirects to Home page
