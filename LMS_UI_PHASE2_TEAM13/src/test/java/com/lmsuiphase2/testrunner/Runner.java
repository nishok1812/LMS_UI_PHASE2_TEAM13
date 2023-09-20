package com.lmsuiphase2.testrunner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class Runner {
	

	@CucumberOptions(
			plugin = {"pretty","html:target/cucumber.html",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
			monochrome=false,  //console output color
			features = "src/test/resources/Features", //location of feature files
			glue= {"com.lmsuiphase2.apphooks","com.lmsuiphase2.stepdefinitions"} )

	public class RunnerFile {

	}


}
