package com.cucumber.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.cucumber.stepdefinition.TestExecutor;

public class RegistrationPage extends TestExecutor{
	
	
	public String FirstName = "//input[@ng-model='FirstName']";
	public String LastName = "//input[@placeholder='Last Name']";
	public String Address = "textarea";
	public String email1 = "//input[@type='email']";
	public String phoneNumber = "//input[@type='tel']";
	
	
	public void enterFirstName(String fname) throws IOException
	{
		com.enterValue(By.xpath(FirstName),fname);
	}
	
	
	public void enterLastName(String lname) throws IOException
	{
		com.enterValue(By.xpath(LastName), lname);
	}
	
	
	public void enterAddress(String addr) throws IOException
	{
		com.enterValue(By.tagName(Address), addr);
	}

	public void enteremail(String mail) throws IOException
	{
	com.enterValue(By.xpath(email1), mail);
	
	}


}
