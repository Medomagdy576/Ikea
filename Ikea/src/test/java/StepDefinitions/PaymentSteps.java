package StepDefinitions;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ProductsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.swing.*;

import static hooks.Hooks.driver;
import static hooks.Hooks.faker;

public class PaymentSteps {
    HomePage home = new HomePage(driver);
    ProductsPage product = new ProductsPage(driver);
    ProductDetailsPage productDetails = new ProductDetailsPage(driver);
    CheckoutPage check = new CheckoutPage(driver);

    String a;



    @Given("User is on Home page {string}")
    public void theUserOpensTheWebsite(String arg0) {
        home.openHomepage();
    }

    @When("User Search for a random product and add it to the bag")
    public void userSearchForARandomProductAndAddItToTheBag() {
        home.ligtiningCategory();
        home.lamp();
        product.addProductToTheCart();
        product.clickGoToBag();
    }

    @And("the user clicks on Checkout")
    public void theUserClicksOnCheckout() {
        productDetails.clickCheckout();
    }

    @And("the user fills in the billing address with valid data")
    public void theUserFillsInTheBillingAddressWithValidData() {
        check.fillFullName(faker.name().fullName());
        check.selectGover(1);
        check.selectArea(1);
        check.fillEmail(faker.internet().safeEmailAddress());
        check.fillPhone("10235124529");
        check.fillAddress(faker.address().fullAddress());
        check.clickContinueBtn1();
    }

    @And("the user selects an available delivery date and time")
    public void theUserSelectsAnAvailableDeliveryDateAndTime() {
        check.clickContinueBtn2();
    }

    @And("the user chooses a payment method")
    public void theUserChoosesAPaymentMethod() {
        check.choosePaymentMethod();

    }

    @And("the user stops before confirming payment")
    public void theUserStopsBeforeConfirmingPayment() {
        driver.switchTo().frame(0);
        check.clickPayBtn();
        check.clickPayBtn();
    }

    @Then("the user should see that payment details are required to complete the order")
    public void theUserShouldSeeThatPaymentDetailsAreRequiredToCompleteTheOrder() {
       check.fillCardNumber();

    }
}
