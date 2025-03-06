Feature: Test user signin feGature

  Background: User opens website
    When User opens the website

  Scenario: Verify the user can able to signin sucessfull
    When User clicks create account link and redirects to create account page
    And User Enter first name "Batman"
    And User Enter last name "Test02"
    And User Enter new email "batmansubscription+test02@gmail.com"
    And User Enter new password "Batman02@123"
    And User Enter confirm password "Batman02@123"
    Then User clicks create account button
    And User redirects to Account page

