$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:NewTestttt.feature");
formatter.feature({
  "name": "Testing feature file",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Test feature steps",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user is in given statement",
  "keyword": "Given "
});
formatter.match({
  "location": "Test_Featureee.user_is_in_given_statement()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is in when statement",
  "keyword": "When "
});
formatter.match({
  "location": "Test_Featureee.user_is_in_when_statement()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is in then statemnet",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Featureee.user_is_in_then_statemnet()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is in another then statement",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:Registration_Test.feature");
formatter.feature({
  "name": "Registration page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launches chromebrowser and open the URL \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Registration_Test.user_launches_chromebrowser_and_open_the_url(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate RadioButton",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User click Male radio button",
  "keyword": "When "
});
formatter.match({
  "location": "Registration_Test.clickMaleRadioButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User validate Male radio button is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration_Test.user_validate_male_radio_button_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User validate Female radio button is not selected",
  "keyword": "And "
});
formatter.match({
  "location": "Registration_Test.user_validate_female_radio_button_is_not_selected()"
});
formatter.result({
  "status": "skipped"
});
});