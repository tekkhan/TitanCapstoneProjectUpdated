package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".\\src\\test\\resources\\Features", 
		glue = "stepDef",
		dryRun = false,
<<<<<<< HEAD
		tags ="@Currency",
=======
		tags ="@Desktop",
>>>>>>> 7ab974ba53bdf9b80eb00e43804297bc00ce03ba
		monochrome = true, 
		strict = true, 
		plugin = {"pretty","html:targ/site/cucumber-pretty","json:target/cucumber.json"},
		publish = true 

)

public class TestRunner {  
	
	public void generateReport() {
	CucumberReportingConfig.reportConfig();
	}
	
}
