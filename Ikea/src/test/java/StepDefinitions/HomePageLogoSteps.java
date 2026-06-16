package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static hooks.Hooks.driver;

public class HomePageLogoSteps {
    HomePage home = new HomePage(driver);




    @Given("User open the URL {string}")
    public void userOpenTheURL(String arg0) {
        home.openHomepage();
    }

    @When("The user Navigate to “Decoration”")
    public void theUserNavigateToDecoration() {
        home.clickDecoration();
        home.clickFramesAndPicturesOption();
    }

    @And("Click on the Logo of the website")
    public void clickOnTheLogoOfTheWebsite() {
        home.backToHomePage();
    }

    @Then("Verify user is redirected to HomePage .")
    public void verifyUserIsRedirectedToHomePage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ikea.com/eg/en/");
    }


}
