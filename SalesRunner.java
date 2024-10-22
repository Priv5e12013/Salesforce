package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features="src/test/java/features/Salesfoce.feature",glue="SalesStepsDefinition",monochrome=true,publish=true)

	public class SalesRunner extends AbstractTestNGCucumberTests{

		
		
	}
