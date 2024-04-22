@demoqa
Feature: Demoqa
  In order to interact with various elements
  As a webapp user, Sam
  Sam should be able to access these elements

  Background:
    Given San has launched the webpage

  @TC1
  Scenario: TC1: Sam can access webpage
    Then he should be able to access the elements

  @TC2
  Scenario Outline: TC2: Sam can enter text to text fields
    When he enters text value "<Input>"
    Then he text value should be submitted for the page
    Examples:
      | Input    |
      | John     |
      | 1234     |
      | Joh@1234 |

  @TC3
  Scenario Outline: TC3: Sam can login to the webpage
    When he enters valid credentials to login page
      | UserName | <UserName> |
      | Password | <Password> |
    Then he text value should be submitted for the page
    Examples:
      | UserName | Password |
      | John     | Abc@1234 |
      | 1234     | Abc@1234 |
      | Joh@1234 | Abc@1234 |

  @TC4
  Scenario: TC4: Varify pageTitle and pageUrl
    Then user should be navigated to the right home page

  @TC5
  Scenario: TC5: Varify that user is able to enter text,click button and read label
    When user select edit text fields to interact
    Then user should be able to enter text to the webpage