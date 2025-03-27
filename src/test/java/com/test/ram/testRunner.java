package com.test.ram;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resource"},
		glue={"StepDefinations"},
		plugin = {"pretty", "html:target/cucumber.html",
	   "json:target/cucumber.json"},
		dryRun=false,
		tags="@Smoke",
		monochrome=true
		)
public class testRunner{


}

