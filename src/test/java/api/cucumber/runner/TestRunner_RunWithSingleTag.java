package api.cucumber.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/featurwithtags"},
        glue = {"api/cucumber/steps"},
        //tags = "@smoke",  //deprecate
        tags = "@important or @regression"
        //tags = {"@smoke and @regression"}
)
public class TestRunner_RunWithSingleTag {

}
