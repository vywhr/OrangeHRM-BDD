package com.test.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)                           //Junit  run cucumber framework 
@CucumberOptions(
        features = "src/test/resources/features", // Path to the feature files
        glue = {"com.test.orangehrm","utility"  },              // Path to step definition files
        plugin = {
            "pretty",                             // For readable console output
            "html:target/cucumber-reports/cucumber.html", // HTML report
            "json:target/cucumber-reports/cucumber.json"  // JSON report
        },
        monochrome = true,                       // Makes console output more readable
        dryRun = false ,                        //true: Only validates if all steps in the feature file have matching step definitions.
        		                                //false: Executes the tests.
        tags = "@InvalidLogin"             // Run specific tagged scenarios
)

public class LoginFeatureRunner {

}



