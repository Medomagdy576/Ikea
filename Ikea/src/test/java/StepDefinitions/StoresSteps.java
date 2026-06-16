package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static hooks.Hooks.driver;

public class StoresSteps {
    HomePage home = new HomePage(driver);



    @Given("The user is on Home page {string}")
    public void theUserIsOnHomePage(String arg0) {
        home.openHomepage();
    }

    @When("The user Click {string} from top menu")
    public void theUserClickStoresFromTopMenu(String arg0) {
        home.clickMoreOption();
        home.clickStores();
    }

    @And("Select any store from list")
    public void selectAnyStoreFromList() {
        home.store();
    }

    @Then("Verify store details displayed")
    public void verifyStoreDetailsDisplayed() {
        home.verifyStore();
    }


}
