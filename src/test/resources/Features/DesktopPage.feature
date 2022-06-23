
Feature: Desktops Tab
Background
Given User is on Retail website


@Desktop
Scenario: User will verify all items are present in Desktops tab
When User click on Desktops tab
And User click on show all desktops
Then User should see all items are present in Desktop page

@Destop1
Scenario: User add HP LP 3065 from Destops tab to the cart
When User click on Desktops tab
And User click on show all desktops
And User click ADD TO CART option on HP LP3065 item
And User click quantity 1
And User click add to Cart button
Then User should see a message 'success: you have added HP LP 3065 to your shoping cart'

@Desktop2
Scenario: User add Canon EOS 5D from Desktops tab to the cart
When User click on Desktops tab
And User click on show all desktops
And User click ADD TO CART option on Canon EOS 5D item
And User select color from dropdown Red
And User select quantity 1
And User click add to Cart button
Then User should see a message 'success: you have added Canon EOS 5D to your shoping cart'

@Desktpop3
Scenario: User add a review to Canon EOS 5D item in Desktop tab

When User click on Desktops tab
And user click on show all deskttops
And User click on Canon EOS 5D item
And User click on write a review link
And User fill teh review information with below information
|yourName|yourReview|Rating|
|khan1 khan12|good experience|good|
And User click on continiue button
Then User should see a message 'Thank you for your review .It has been submitted to the webmaster for approval'



