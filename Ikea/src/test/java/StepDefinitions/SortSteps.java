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

public class SortSteps {
    HomePage home = new HomePage(driver);
    ProductsPage product = new ProductsPage(driver);

    double p1;
    double p2;



    @Given("User is on Home Page {string}")
    public void userIsOnHomePage(String arg0) {
        home.openHomepage();
    }

    @When("User Search for {string}")
    public void userSearchForLivingRoom(String arg0) {
        home.fillSearch("Living room");
        home.clickSearchBtn();
    }

    @And("User get first product price before sort")
    public void userGetFirstProductPriceBeforeSort() {
        product.getFirstPriceProductBeforeSort();
        System.out.println(product.getFirstPriceProductBeforeSort());
        p1 = product.getFirstPriceProductBeforeSort();
    }

    @And("Apply filter {string}")
    public void applyFilterPriceLowToHigh(String arg0) {
        product.clickSort();
        product.fromLowTohighSort();
        product.clickSort();
    }

    @And("User get first product price after sort")
    public void userGetFirstProductPriceAfterSort() {
        product.getFirstPriceProductAfterSort();
        System.out.println(product.getFirstPriceProductAfterSort());
    }

    @Then("Verify products sorted correctly")
    public void verifyProductsSortedCorrectly() {
        Assert.assertTrue(p1 > product.getFirstPriceProductAfterSort(),
                "Sorting failed! Expected first price < second price, but got: "
                        +p1 + " >= " + product.getFirstPriceProductAfterSort());
    }



}
