package com.cucumber.utility;

import com.cucumber.stepdefinition.TestExecutor;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestExecutor{
	
	@Before(order=1)
	public void validateBeforeScenario()
	{
		System.out.println("Pre condition 1");
	}
	
	@Before(order=2)
	public void BeforeScenario2()
	{
		System.out.println("Pre condition 2");
	}
	
	
	@After(order=2)
	public void closeBrowser()
	{
		System.out.println("post condition 2");
	}
	
	@After(order=1)
	public void afterscenario()
	{
		System.out.println("POst condition 1");
	}
	
	
	@Before("@Regression,@test")
	public void test()
	{
		System.out.println("Pre condition for Regression");
	}
	
	
	@After("@Regression,@test")
	public void test1()
	{
		System.out.println("post condition for Regression");
	}

	
	
}
