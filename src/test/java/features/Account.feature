Feature: Account page login

  Background: Launch web driver
    Given open Web driver

  @account
  Scenario: Account page login
    Given open url
    When user enter username neeraj and password neeraj123
    And Click on submit button
    Then Verify the dashBord page