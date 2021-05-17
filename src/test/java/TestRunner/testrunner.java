package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
(
	features = "src/test/java/features",
	glue = {"StepDefination","util"},
	tags ={"@RegMail"},
	dryRun = false,
	monochrome = true,
	plugin = {"pretty","junit:target/reports/jreport.xml"}
	)


public class testrunner {

}
