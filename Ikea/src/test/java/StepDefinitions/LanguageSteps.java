package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static hooks.Hooks.driver;

public class LanguageSteps {
    HomePage home = new HomePage(driver);
    String a;


    @Given("The User is on Home page {string}")
    public void theUserOpensTheWebsite(String arg0) {
        home.openHomepage();
    }

    @When("User Locate language selector")
    public void userLocateLanguageSelector() {
        home.clickOnLanguage();
    }

    @And("Switch from English to Arabic")
    public void switchFromEnglishToArabic() {
        home.clickArabicLanguage();
    }

    @Then("verify page content is in Arabic")
    public void verifyPageContentIsInArabic() {
        a =home.arabicText();
        Assert.assertEquals(a,"مرحباً! تسجيل الدخول أو الاشتراك");
    }
}
