package api.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("User should be logged in and should be present on his wall")
    public void user_should_be_logged_in_and_should_be_present_on_his_wall() {
        // Code to ensure user is logged in and on their wall

        //webDriver =  webDriver.getDriver()
        //
        System.out.println("User is logged in and on their wall");
    }

    @When("I type the message in the box")
    public void i_type_the_message_in_the_box() {
        // Code to type a message into a text box
        System.out.println("Message typed in the box");
    }

    @When("Click on post button")
    public void click_on_post_button() {
        // Code to click the post button
        System.out.println("Post button clicked");
    }

    @Then("the message should get posted")
    public void the_message_should_get_posted() {
        // Code to verify the message has been posted
        System.out.println("Message posted successfully");
    }
}