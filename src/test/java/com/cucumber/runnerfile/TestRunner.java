package com.cucumber.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Karen Amy\\eclipse-workspace\\Dec_BDD_Cucumber\\src\\test\\java\\com\\cucumber\\feature",
				glue= "com.cucumber.stepdefinition",
				plugin= {"pretty","html:TestOutput/CucumberReport"},
				tags= {"~@test"},
				dryRun=true,// It will check the unimplemented steps in feature file before execution
				monochrome = true) //display console in proper readable format
public class TestRunner {

}
