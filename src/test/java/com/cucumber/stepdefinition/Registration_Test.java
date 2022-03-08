package com.cucumber.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration_Test extends TestExecutor{
	
	@cucumber.api.java.en.Given("User launches chromebrowser and open the URL {string}")
	public void user_launches_chromebrowser_and_open_the_url(String url) throws IOException {
		OpenUrl(url);
		
	}

	@cucumber.api.java.en.When("User enter value in FirstName {string}")
	public void user_enter_value_in_first_name(String firstName) throws IOException {
		
		register.enterFirstName(firstName);
	   
	}

	@cucumber.api.java.en.When("User enter value in LastName {string}")
	public void user_enter_value_in_last_name(String lastName) throws IOException {
		
		register.enterLastName(lastName);
	   
	}

	@cucumber.api.java.en.When("User enter value in Address {string}")
	public void user_enter_value_in_address(String adddress) throws IOException {
		
		
	   register.enterAddress(adddress);
	}

	@When("User enter value in email {string}")
	public void user_enter_value_in_email(String email) throws IOException {
		
		register.enteremail(email);
	 
	}

	@Then("User validate the page titile {string}")
	public void user_validate_the_page_titile(String expectedTitl) {
	  
	}

	@Given("User launches chrome browser and open the URL {string}")
	public void user_launches_chrome_browser_and_open_the_url(String string) {
	    
	}

	@When("^User click Male radio button$")
	public void clickMaleRadioButton()
	{
		System.out.println("click radio button");
	}

	@Then("User validate Male radio button is selected")
	public void user_validate_male_radio_button_is_selected() {
	   
		
		System.out.println("Validate male radio button");
	}

	@Then("User validate Female radio button is not selected")
	public void user_validate_female_radio_button_is_not_selected() {
		
		System.out.println("Validate  Female radio button");
	  
	}
	
	@Then("user is in another then statement")
	public void newStep()
	{
		
	}
	
	@Then("user validate new title {String}")
	public void newValidation(String title)
	{
		
	}



}
