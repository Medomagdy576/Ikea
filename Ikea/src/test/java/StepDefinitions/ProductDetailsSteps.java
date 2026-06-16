package StepDefinitions;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static hooks.Hooks.driver;

public class ProductDetailsSteps {
    HomePage home = new HomePage(driver);
    ProductDetailsPage productDetail = new ProductDetailsPage(driver);
    String p1;
    String p2;




    @Given("the user open the website {string}")
    public void theUserOpensTheWebsite(String arg0) {
        home.openHomepage();
    }

    @When("the user clicks on a random product displayed on the home page")
    public void theUserClicksOnARandomProductDisplayedOnTheHomePage() {
        home.clickProduct();
    }

    @Then("the product details page should be opened")
    public void theProductDetailsPageShouldBeOpened() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ikea.com/eg/en/p/ekrar-hat-and-coat-stand-bright-red-30600289/");


//        System.out.println(productDetail.getProductDetails2());
//        System.out.println(home.getProductDetails1());

    }

    @And("the product details on the product page should match the product details displayed on the home page")
    public void theProductDetailsOnTheProductPageShouldMatchTheProductDetailsDisplayedOnTheHomePage() {
//        Assert.assertEquals(home.getProductDetails1(),productDetail.getProductDetails2());


       Assert.assertEquals("Hat and coat stand, bright red, 169 cm",productDetail.getProductDetails2());

    }
}
