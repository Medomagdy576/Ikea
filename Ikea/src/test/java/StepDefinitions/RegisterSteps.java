package StepDefinitions;

import Pages.HomePage;
import Pages.SignupPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static hooks.Hooks.driver;
import static hooks.Hooks.faker;

public class RegisterSteps {

    HomePage home = new HomePage(driver);
    SignupPage signup = new SignupPage(driver);




    @Given("User is on home page")
    public void UserIsOnHomePage(){
        home.openHomepage();
    }


    @And("the user navigates to the {string} page")
    public void theUserNavigatesToThePage(String arg0) {
        home.login_signup();
        home.createAccountBtn();
    }

    @When("the user enters valid registration data")
    public void theUserEntersValidRegistrationData(){
        signup.fillFirstName(faker.name().firstName());
        signup.fillLastName(faker.name().lastName());
        signup.fillEmaillAdress(faker.internet().safeEmailAddress());
        signup.fillPassword("MMMlll1415$");
        signup.checkPrivacyCheckBox();
    }

    @And("clicks the {string} button")
    public void clicksTheButton(String arg0) {
        signup.clickCreateAccount();
    }

    @Then("the user account should be created successfully")
    public void theUserAccountShouldBeCreatedSuccessfully() {
        home.verifyProfile();
    }
}
