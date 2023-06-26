Feature: Application Login Page one
#  Background: Launch web driver
#    Given open Web driver
  @Desktop
  Scenario: home page login
    Given open url
    When user enter username neeraj and password neeraj123
    And Click on submit button
    Then Verify the dashBord page

  @Desktop
  Scenario: home page login two
    Given open url
    When user enter username bhavna and password bhavna123
    And Click on submit button
    Then Verify the dashBord not displayed page

  @Desktop
  Scenario: home page login three
    Given open url
    When User sign up with following details
      | Neeraj | Sharma | Java | Cucumber | 12345 |
    And Click on submit button
    Then Verify the dashBord not displayed page

  @MobileTest
  Scenario Outline: home page login four
    Given open url
    When User login to with multiple data set "<User>" and "<Pass>"
    And Click on submit button
    Then Verify the dashBord not displayed page
    Examples:
      | User   | Pass      |
      | Neeraj | neeraj123 |
      | Bhavna | bhavna123 |

