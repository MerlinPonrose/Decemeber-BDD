Feature: Registration page

Background:
Given User launches chromebrowser and open the URL "http://demo.automationtesting.in/Register.html"

@Regression
Scenario: Enter registration detail
When User enter value in FirstName "Vcentry"
And User enter value in LastName "Test"
And User enter value in Address "Guindy"
And User enter value in email "abc@gmail.com"
Then User validate the page titile "Register"

@test
Scenario: Validate RadioButton
When User click Male radio button
Then User validate Male radio button is selected
And User validate Female radio button is not selected