package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginStepDefinitionforScenarioWithExamples {
    private WebDriver webDriver;


    @Given("Use is on Home page")
    public void useIsOnHomePage() {
        WebDriverManager.chromedriver().setup();
        //WebDriver driver = new FirefoxDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.saucedemo.com/");

    }

    @When("User Navigate to Login Page")
    public void userNavigateToLoginPage() {
        System.out.println("User Navigate to Login Page");
    }
    @And("User enters {string} and {string}")
    public void user_enters(String username,String password){
        System.out.println("User name " +username + "password is "+password);
        webDriver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        webDriver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully()throws Throwable {
        System.out.println("succesfully logged in");
        Thread.sleep(2000);
        webDriver.close();

    }



}
