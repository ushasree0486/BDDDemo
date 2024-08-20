package api.cucumber.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
/*@CucumberOptions(features={"src/test/java/api/cucumber/features"},
        glue = {"api/cucumber/steps"}*/
///*dryRun=true*/)
@CucumberOptions(features={"src/test/java/api/cucumber/features/posts.feature"},
        glue = {"api/cucumber/steps","api.cucumber.hook"},dryRun = false)

public class PostRunner {

}
