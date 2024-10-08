package api.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {

    // Define any necessary variables here, such as page objects or test data

    @Given("User is on login page")
    public void user_is_on_login_page()throws Throwable {
        // Code to navigate to the login page
        // For example: driver.get("http://example.com/login");
        System.out.println("user_is_on_login_page");
        System.out.println("today is teachers day");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Code to enter username and password
        // For example:
        // driver.findElement(By.id("username")).sendKeys("testuser");
        // driver.findElement(By.id("password")).sendKeys("password");
        System.out.println("Entered username and password");

    }

    @When("click on login button")
    public void click_on_login_button() {
        // Code to click the login button
        // For example: driver.findElement(By.id("loginButton")).click();
        System.out.println("Clicked on login button");
    }

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        // Code to verify that the user is navigated to the home page
        // For example:
        // assertTrue(driver.getCurrentUrl().equals("http://example.com/home"));
        System.out.println("User is navigated to the home page");
    }

    @Given("User is at the login page of the application")
    public void userIsAtTheLoginPageOfTheApplication() throws Throwable {
        System.out.println("User is at the login page of the application");
    }


    @When("User logs in with following username and password:")
    public void userLogsInWithFollowingUsernameAndPassword(DataTable dataTable)throws Throwable {
       // System.out.println(dataTable.asList());/*;
        List<List<String>> list_of_rows = dataTable.asLists();
        for(List<String> row :list_of_rows){
            for(String str :row){
                System.out.println( "Data "+str);
            }
        }

    }

    @Then("User should be able to login with username and password")
    public void userShouldBeAbleToLoginWithUsernameAndPassword() {
        System.out.println("User should be able to login with username and password");
    }


}