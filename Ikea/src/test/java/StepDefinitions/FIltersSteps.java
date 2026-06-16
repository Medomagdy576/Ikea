package StepDefinitions;

import Pages.HomePage;
import Pages.ProductsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static hooks.Hooks.driver;

public class FIltersSteps {
    HomePage home = new HomePage(driver);
    ProductsPage product = new ProductsPage(driver);
    double s1;

    @Given("The User is on Home Page {string}")
    public void theUserIsOnHomePage(String arg0) {
        home.openHomepage();
    }


    @When("The user Navigate to {string} category")
    public void theUserNavigateToBedsCategory(String  arg0) {
        home.clickBedsCatg();
        home.clickBedOption();
    }

    @And("Apply filter {string} and {string}")
    public void applyFilterMaterialWoodAndPriceEGP(String arg0, String arg1) {
        product.matrialFilter();
        product.woodMatrial();
        product.matrialFilter();
        product.priceFilter();
        product.selectPriceRange();
        product.priceFilter();
    }

    @Then("Verify displayed products match both filters")
    public void verifyDisplayedProductsMatchBothFilters() {
        Assert.assertTrue(product.getBedProductName().contains("Luröy"),"This product not Wood");
        s1 = product.getBedProductPrice();
        Assert.assertTrue(s1 >= 10000 && s1 <= 19999,"This price is not in Range of 10000 - 19999");
    }
}
