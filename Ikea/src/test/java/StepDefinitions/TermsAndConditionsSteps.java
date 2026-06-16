package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static hooks.Hooks.driver;

public class TermsAndConditionsSteps {
    Actions actions = new Actions(driver);
    HomePage home = new HomePage(driver);




    @Given("User is on home Page {string}")
    public void userIsOnHomePage(String arg0) {
        home.openHomepage();
    }

    @When("User Scroll to footer section")
    public void userScrollToFooterSection() {
        actions.sendKeys(Keys.END).perform();
    }

    @And("Click on {string} link")
    public void clickOnTermsAndConditionsLink(String arg0) {
        home.clickTermsAndCondition();
    }

    @Then("Verify page title contains {string}")
    public void verifyPageTitleContainsTermsAndConditions(String arg0) {
        home.getTermsAndConditionText();
    }


}
