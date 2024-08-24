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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class LoginDemoSteps_PF {
    WebDriver webDriver = null;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("browser is open")
    public void browser_Is_Open() {
        System.out.println("===  I am inside LoginDemoSteps_PF class  ===");
        System.out.println("inside step - browser is open");
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
        webDriver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    @When("user enters {string} and {string}")
    public void user_enters(String username, String password) throws Throwable {
        login = new LoginPage_PF(webDriver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }

    @And("user clicks on login")
    public void user_Clicks_On_Login() {
        login.clickOnLogin();
    }

    @Then("user is navigated to the home page")
    public void user_Is_Navigated_To_The_Home_Page() throws InterruptedException {
        home=new HomePage_PF(webDriver);
        //home.checkLogOutIsDisplayed();
        Assert.assertTrue(home.checkLogOutIsDisplayed());
        Thread.sleep(2000);
        webDriver.close();
    }
}


