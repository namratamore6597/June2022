package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		             features="src/test/resources/Busuiness_Logic",
		             tags="@smokeTest",
                     glue="cucumbermap"
		
		)

public class SmokeTestRunner 
{
	

}
