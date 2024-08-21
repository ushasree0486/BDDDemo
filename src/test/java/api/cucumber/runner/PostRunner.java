package api.cucumber.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/java/api/cucumber/features/login_demo.feature"},
        glue = {"api/cucumber/steps"}
        , dryRun = false)
/*
@CucumberOptions(features = {"src/test/java/api/cucumber/features/login_demo.feature"},
        glue = {"api/cucumber/steps", "api/cucumber/hook"}
        //,plugin={"pretty","html:target/HtmlReports"}
        //,plugin={"pretty","json:target/report.json"}
        ,plugin={"pretty","junit:target/report.xml"},tags="@SmokeTest"
)
*/

public class PostRunner {

}
