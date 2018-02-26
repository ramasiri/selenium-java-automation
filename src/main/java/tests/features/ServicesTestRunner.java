package tests.features;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {
                              "src/main/java/tests/features/FirstAPI.feature"
                            },
          
         glue = "tests/step.servicedefinition",
         plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json", "junit:target/cucumber/cucumber.xml"})
         
public class ServicesTestRunner extends AbstractTestNGCucumberTests{
}
