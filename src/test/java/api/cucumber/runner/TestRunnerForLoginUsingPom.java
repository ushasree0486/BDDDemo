package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

/*@CucumberOptions(features = {"src/test/resources/features/login_demo.feature"},
        glue = {"api/cucumber/steps"},
        monochrome = true,
        plugin={"pretty","html:target/HtmlReports"
        ,"pretty","json:target/report.json"
        ,"pretty","junit:target/report.xml"}

)*/


public class TestRunnerForLoginUsingPom {

}
