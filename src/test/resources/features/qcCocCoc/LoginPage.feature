Feature: Allow users to login to quang cao coc coc website

  @Login
  Scenario Outline: Login successfully with email and password
    Given Navigate to quang cao coc coc login site
    When Login with '<email>' and '<password>'
    Then Should navigate to home page site
    Examples:
      |email|password|
      |xxxxx|xxxxx|

  @pending
  Scenario Outline: Login failed with invalid email
    Given Navigate to quang cao coc coc login site
    When Login with '<email>' and '<password>'
    Then Should prompt with '<errormessage>'
    Examples:
      |email|password|errormessage|
      |a|FernandoTorres12345#|abc@example.com|