Feature: Registration page with multiple data


Scenario Outline: Registeraytion using multiple data
Given User launches chromebrowser and open the URL "<URL>"
When User enter value in FirstName "<FirstName>"
And User enter value in LastName "<LastName>"
And User enter value in Address "<address>"
And User enter value in email "<email>"
Then User validate the page titile "<title>"

Examples:
|URL | FirstName | LastName | address | email | title |
|http://demo.automationtesting.in/Register.html | Vcentry |Test|Guindy|abc@gmail.com|Register|
|http://demo.automationtesting.in/Register.html | Vcentry1 |Test1|Saidapet|def@gmail.com|register|
|http://demo.automationtesting.in/Register.html | Vcentry2 |Test2|Perungudi|xyz@gmail.com|Register|