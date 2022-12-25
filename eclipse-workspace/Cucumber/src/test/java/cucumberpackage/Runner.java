package cucumberpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features ="C:\\Users\\shubh\\eclipse-workspace\\Cucumber\\src\\test\\java\\cucumberpackage\\a.feature",
			glue= {"cucumberpackage"},
			monochrome = true,
			dryRun = false,
			tags = {"@sanity"},
			plugin = {"pretty","html:target/html/cucmber-reports", "json:target/json/cucmber.json",
					"junit:target/junit/cucumber.xml"}
					
			)
	public class Runner {
		
	
}
