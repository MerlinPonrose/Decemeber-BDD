package com.cucumber.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.pages.RegistrationPage;
import com.cucumber.utility.Common;

public class TestExecutor {

	public static WebDriver driver;
	
	public static Common com = new Common();
	public static RegistrationPage register = new RegistrationPage();
	
	
	public void OpenUrl(String url) throws IOException
	{
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\DecSeleniumProject\\exe\\chromedriver.exe");
			
			driver = new ChromeDriver();
		
	
		
			driver.get(url);
			
	}
	
	
	
}
