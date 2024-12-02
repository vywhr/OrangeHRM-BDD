package com.test.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/features",
		glue={"com/test/orangehrm","utiity"},
		
		plugin={"pretty",
				 "html:target/Cucumber-Reports/Cucumber.html",
				 "json:target/Cucumber-Reports/Cucumber.json"
				},
		
		monochrome=true,
		dryRun=true,
		tags="@RegressionTest"
		)
public class HomePageTest {

}
