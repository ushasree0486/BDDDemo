package api.cucumber.steps;

import api.cucumber.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import api.cucumber.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_Pom {
    WebDriver webDriver = null;
    LoginPage login;

    @Given("browser is open")
    public void browser_Is_Open() {
        System.out.println("===I am inside browser_is_open===");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        webDriver.manage().window().maximize();
    }
    @And("user is on login page")
    public void user_Is_On_Login_Page() {
        webDriver.navigate().to("https:example.testproject.io/web/");
    }

    @When("user enters {string} and {string}")
    public void user_Enters_Username_and_password(String username, String password)throws Throwable {
        login = new LoginPage(webDriver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }

    @And("user clicks on login")
    public void user_Clicks_On_Login() {
        login.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void user_Is_Navigated_To_The_Home_Page()throws InterruptedException {
        Assert.assertTrue(login.checkLogOutIsDisplayed());
        Thread.sleep(2000);
        webDriver.close();
    }
}
