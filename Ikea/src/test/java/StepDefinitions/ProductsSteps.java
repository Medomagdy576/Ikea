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

public class ProductsSteps {
    HomePage home = new HomePage(driver);
    ProductsPage product = new ProductsPage(driver);

    String p1;





    @Given("the user on the website {string}")
    public void theUserOpensTheWebsite(String arg0) {
        home.openHomepage();
    }

    @When("the user enters a product keyword into the search bar")
    public void theUserEntersAProductKeywordIntoTheSearchBar() {
        home.fillSearch("phone");
    }

    @And("clicks the search icon")
    public void clicksTheSearchIcon() {
        home.clickSearchBtn();
    }

    @Then("the search results should display products related to the entered keyword")
    public void theSearchResultsShouldDisplayProductsRelatedToTheEnteredKeyword() {
//        p1 = product.verifyProducts();
//        System.out.println(p1);
        System.out.println(product.verifyProducts());
        Assert.assertTrue(product.verifyProducts().contains("phone"), "These products have no relation to Phones");
    }
}
