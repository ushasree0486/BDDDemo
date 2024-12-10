package api.cucumber.steps;

import api.cucumber.Pages.LoginPage;
import api.cucumber.pagefactory.HomePage_PF;
import api.cucumber.pagefactory.LoginPage_PF;
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
   WebDriver webdriver = null;
     LoginPage login;

    @Given("browser is open")
    public void browse_Is_Open()throws Throwable {
        //System.out.println("===I am inside browser_is_open===");
        System.out.println("browse_Is_Open");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webdriver = new ChromeDriver(options);
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        webdriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        webdriver.manage().window().maximize();

    }

    @And("user is on login page")
    public void user_Is_On_Login_Page()throws Throwable {
        System.out.println("user is on login page");
        webdriver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

    }


    @When("user enters {string} and {string}")
    public void user_enters(String username, String password) throws Throwable {
         login = new LoginPage(webdriver);
         login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);


    }

    @And("user clicks on login")
    public void user_Clicks_On_Login()throws Throwable {
        login.clickLogin();

    }

    @Then("user is navigated to the home page")
    public void user_Is_Navigated_To_The_Home_Page() throws Throwable {
        Assert.assertTrue(login.checkLogOutIsDisplayed());
        Thread.sleep(2000);
        webdriver.close();

    }
}
