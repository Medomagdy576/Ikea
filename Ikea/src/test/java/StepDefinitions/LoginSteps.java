package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static hooks.Hooks.driver;

public class LoginSteps {
    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);

    @Given("the user has already created an account")
    public void userhaveAccount(){

    }

    @And("the user opens the website {string}")
    public void theUserOpensTheWebsite(String arg0) {
        home.openHomepage();
    }

    @When("the user clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {
        home.login_signup();
    }

    @And("enters a valid email and password \\(the same credentials used during registration)")
    public void entersAValidEmailAndPasswordTheSameCredentialsUsedDuringRegistration() {
        login.fillEmail("tamavy@mailinator.com");
        login.fillPass("Pa$$w0rd!");
    }

    @And("clicks the login button")
    public void clicksTheLoginButton() {
        login.clickLoginBtn();
    }

    @Then("the user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        login.verifyLogin();
    }

}
