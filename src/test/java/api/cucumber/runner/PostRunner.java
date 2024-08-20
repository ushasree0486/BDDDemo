package api.cucumber.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
/*@CucumberOptions(features={"src/test/java/api/cucumber/features"},
        glue = {"api/cucumber/steps"}*/
///*dryRun=true*/)
@CucumberOptions(features={"src/test/java/api/cucumber/features/PostWithParameter.feature"},
        glue = {"api/cucumber/steps"},dryRun = false)

public class PostRunner {

}
