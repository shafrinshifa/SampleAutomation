package runner;

import org.junit.runner.RunWith;

import io.cucumber.core.plugin.PrettyFormatter;
import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/featureFiles/Amazon add2card.feature", 
                   glue = "steps",
                 dryRun=!true,
                   monochrome = true,
                   plugin = {"pretty","html:reports",
                		   })
                    

   



public class RunnerClass{
	

}
