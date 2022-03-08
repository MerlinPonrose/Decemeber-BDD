package com.cucumber.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.stepdefinition.TestExecutor;


public class Common extends TestExecutor{
	
	
	public void clickElementByXpath(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void ClickElement(By locator)
	{
		try
		{
			driver.findElement(locator).click();
		}
		catch(Exception e)
		{
			System.out.println("error occured");
		}
		
	}
	
	public void enterValue(By locator,String value)
	{
		ClickElement(locator);
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(value);
		
	}
	
	
	public void scrollToElement(By locator)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));

	}
	
	public void moveToElement(By locator)
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(locator)).build().perform();
	}


}
