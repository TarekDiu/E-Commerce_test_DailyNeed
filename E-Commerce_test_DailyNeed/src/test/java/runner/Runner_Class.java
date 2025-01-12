package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//resources//features",
		glue="stepDefination",
	    dryRun = false,
		monochrome = true,
		tags= "@test1 or @test2"
		
		)


public class Runner_Class {

}
