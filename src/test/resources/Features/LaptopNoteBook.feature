Feature: Laptop & NoteBooks

  Background: 
    Given User is on Retail website
    When User click on Laptop and NoteBook tab
    And User click on show all Laptops and NoteBook option

  @laptop
  Scenario: Add and Remove a Mac book from Cart
    And User click on MacBook item
    And User click on Add to Cart button
    Then User should see a message 'Success: you have added MacBook to your shopping cart'
    And User should see '1 item(s)-602-00' showed to the cart
    And User click on cart option
    And User click on red X button to remove the item from the cart
    Then item should be removed and cart should show 0 item(s)

  @laptop1
  Scenario: Product comparison
    And User click on product comparison icon on 'MacBook'
    And User click on product comparison icon on MacBook Air
    Then User should seee a message 'success:you have added MacBook Air to your product comparison'
    And User click on product comparison link
    Then User should see Product Comparison Chart

  @laptop2
  Scenario: Adding an item to Wish list
    And User click on heart icon to add 'Sony ValO' laptop to wish list
    Then User should get a message 'you must login or create an account to save Sony VaIo laptop to wish list'

  @laptop3
  Scenario: Validate the price of MacBook Pro IS 2000
    And User click on MacBook Pro item
    Then User should see '2,000.00' price tag is present on UI
