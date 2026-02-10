package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/contacts.feature", //Path of feature file
        glue = {"stepDefinition"}, //path of stepdefinition files
        plugin = {
                "pretty",
                //"html:test-output","json:json_output/cucumber.json"
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true,
        dryRun=false
)
public class TestRunner {
	
}
