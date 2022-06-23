@retail12
Feature: Retail page

Background:
Given User is on Retail website
And User click  on MyAccount
When User click on Login 
And User enter userName 'khan445553@tekschool.us' and password  'jan12345'     
And User click on Login button
Then User should be logged in to MyAccount dashboard


@retail
Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on 'Register for an Affiliate Account' link
And User will fill Affiliate form with below information
|company|website|taxID|paymentMethod|payee Name|
|palawan|www.khan1234.com|2021|cheque|jamal1|
And User should check on about us check box
And User click on Continue button
Then User should see a success message

@retail1
Scenario: Edit your affilitate information from cheque method to Bank Transfer
When User click on 'Edit your affiliate information' links 
And User click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|Wells Fargo|12345|12345|baba|12345678910|
And User click on Continiue button
Then User should see a success message

@retail2
Scenario: Edit your account Information
When User click on 'Edit your account information' link2
And User modify below information
|fristName|lastName|email|telephone|
|lala|kaka|lalakaka@gmail.com|1122334455|
And User click on continiue button
Then User should see a message 'Success:Your account has been successfully updated'


