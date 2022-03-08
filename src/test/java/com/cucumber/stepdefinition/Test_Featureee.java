package com.cucumber.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Featureee {
	
	
	@Given("user is in given statement")
	public void user_is_in_given_statement() {
	    System.out.println("In given statement");
	}

	@When("user is in when statement")
	public void user_is_in_when_statement() {
		   System.out.println("In when statement");
	}

	@Then("user is in then statemnet")
	public void user_is_in_then_statemnet() {
		   System.out.println("In then statement");
	}



}
