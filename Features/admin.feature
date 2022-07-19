Feature: login feature of NOP commAPP

  @ValidCred
  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser

  @InValidCred
  Scenario: Successful Login with InValid Credentials with single user
    Given User Launch Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "adminInvalid@yourstore.com" and Password as "adminInvalid"
    And Click on Login
    Then Page should contains "Login was unsuccessful."
    Then Page Title should be "Your store. Login"
    And close browser

  @InValidCred2
  Scenario Outline: Successful Login with InValid Credentials
    Given User Launch Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page should contains "Login was unsuccessful."
    Then Page Title should be "Your store. Login"
    And close browser

    Examples: 
      | email                       | password        |
      | adminInvalid1@yourstore.com | InvalidPassword |
      | adminInvalid2@yourstore.com | InvalidPassword |
      | adminInvalid3@yourstore.com | InvalidPassword |
