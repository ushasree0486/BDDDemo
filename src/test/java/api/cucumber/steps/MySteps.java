package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps {
    @Given("User should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {
    }

    @When("I type the message as {string} in the text box")
    public void iTypeTheMessageAsInTheTextBox(String arg0) {
    }

    @And("Click on post button")
    public void clickOnPostButton() {
    }

    @Then("the message should get posted")
    public void theMessageShouldGetPosted() {
    }

    @When("User supply the youtube link as {string} in the text box")
    public void userSupplyTheYoutubeLinkAsInTheTextBox(String arg0) {
    }

    @Then("Then video should get posted on the user wall")
    public void thenVideoShouldGetPostedOnTheUserWall() {
    }

    @And("the video should have proper thumbnail")
    public void theVideoShouldHaveProperThumbnail() {
    }
}
