package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/resources.features",
	    glue = {"Stepdefinitions"},
	    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"}
//	    tags = "@smoke"  // You can use tags to run specific tests
	)
	public class CucumberTestRunner extends AbstractTestNGCucumberTests {
	

}
