package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @When("I type the message as {string} in the text box")
    public void iTypeTheMessageAsInTheTextBox(String text) {
        System.out.println(text);
    }

    @Given("User should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {
        System.out.println("User should be logged in and should be present on his wall");
    }

    @And("Click on post button")
    public void clickOnPostButton() {
        System.out.println("Click on post button");
    }

    @Then("the message should get posted")
    public void theMessageShouldGetPosted() {
        System.out.println("the message should get posted");
    }

    @When("User supply the youtube link as {string} in the text box")
    public void userSupplyTheYoutubeLinkAsInTheTextBox(String text) {
        System.out.println(text);
    }

    @Then("Then video should get posted on the user wall")
    public void thenVideoShouldGetPostedOnTheUserWall() {
        System.out.println("Then video should get posted on the user wall");
    }

    @And("the video should have proper thumbnail")
    public void theVideoShouldHaveProperThumbnail() {
        System.out.println("the video should have proper thumbnail");
    }

    @When("User supply the youtube link in the text box")
    public void userSupplyTheYoutubeLinkInTheTextBox() {
        System.out.println("User supply the youtube link in the text box");
    }

    @When("I type the message in the box")
    public void iTypeTheMessageInTheBox() {
        System.out.println("I type the message in the box");

    }
}
