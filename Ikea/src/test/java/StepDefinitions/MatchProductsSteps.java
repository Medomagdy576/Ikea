package StepDefinitions;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ProductsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static hooks.Hooks.driver;

public class MatchProductsSteps {
    HomePage home = new HomePage(driver);
    ProductsPage product = new ProductsPage(driver);
    ProductDetailsPage productDetails = new ProductDetailsPage(driver);


    String p1;
    String p2;
    double s1;
    double s2;



    @Given("The User is on home page {string}")
    public void theUserIsOnHomePage(String arg0) {
        home.openHomepage();
    }

    @When("The user navigate to any category")
    public void theUserNavigateToAnyCategory() {
        home.ligtiningCategory();
        home.lamp();
    }

    @And("Note the title and price of a product from the category listing page.")
    public void noteTheTitleAndPriceOfAProductFromTheCategoryListingPage() {
        p1 = product.getProductName();
        s1 = product.getProductPrice();
    }

    @And("Click on the same product to open its details page")
    public void clickOnTheSameProductToOpenItsDetailsPage() {
        product.openProductDetails2();
        p2 =  productDetails.getProductName();
        s2 = productDetails.getProductPrice();
    }

    @Then("Compare the product title and price with the listing page values")
    public void compareTheProductTitleAndPriceWithTheListingPageValues() {
        Assert.assertEquals(p1,p2);
        Assert.assertEquals(s1,s2);
    }

}
