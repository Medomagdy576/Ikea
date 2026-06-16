package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_pirate.Gangway;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static hooks.Hooks.driver;

public class ContactUsSteps {
    HomePage home= new HomePage(driver);
    Actions actions = new Actions(driver);



    @Given("Open the URL {string}")
    public void openTheURL(String arg0) {
        home.openHomepage();
    }

    @When("The user Scroll to footer")
    public void theUserScrollToFooter() {
        actions.sendKeys(Keys.END).perform();
    }

    @And("Click on {string}")
    public void clickOnContactUs(String arg0) {
        home.clickContactUs();
    }

    @Then("Verify Contact Us page loads with contact options")
    public void verifyContactUsPageLoadsWithContactOptions() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ikea.com/eg/en/customer-service/contact-us/");
        home.verifyContactUsOptions();
    }


}
