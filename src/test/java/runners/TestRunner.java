package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features ="Features",
		glue= "steps",
		tags = "@smokeTest"
		
		)




public class TestRunner extends AbstractTestNGCucumberTests {

	
	
	
	
}
