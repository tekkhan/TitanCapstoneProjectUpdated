@home
Feature: Home Page

    Background:
    Given User is on retail Website
 
    @login 
    Scenario: login to Test Environment
    When User click on myAccount
    And User click on Login option
    And User enter userName "khan4455@tekschool.us" and password "jan123"
    And User click on login button
    Then User should be logged into myAccount dashboard
    
    
  
    @Currency
    Scenario: User verify currency values change
    When User click on Currency
    And User Chose Euro from dropdown
    Then currency value should change to Euro
    
    
    @shopingcart
    Scenario: User empty Shoping cart message displays
    When User click on shopping cart
    Then "your shopping cart is empty!" message should display
    
    