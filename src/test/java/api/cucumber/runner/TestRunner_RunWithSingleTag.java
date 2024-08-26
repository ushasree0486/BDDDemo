package api.cucumber.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/featurewithtags"},
        glue = {"api/cucumber/steps"},
        //tags = "@smoke,@regression" //deprecate
        //tags = "@important or @regression"
        //tags = "@smoke and @regression"
        tags ="(@smoke or @regression) and @important"
        //tags =" @regression and not @smoke"
        //tags ="(@smoke or @regression) and not @important"


)
public class TestRunner_RunWithSingleTag {

}
