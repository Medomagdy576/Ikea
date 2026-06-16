package StepDefinitions;

import Pages.FavouritsPage;
import Pages.HomePage;
import Pages.ProductsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static hooks.Hooks.driver;

public class AddProductToFavSteps {
    HomePage home = new HomePage(driver);
    ProductsPage product = new ProductsPage(driver);
    FavouritsPage fav = new FavouritsPage(driver);


    @Given("User is on home page {string}")
    public void theUserOpensTheWebsite(String arg0) {
        home.openHomepage();
    }

    @When("User Add random product to favorite")
    public void userAddRandomProductToFavorite() {
        home.hoverProducts();
        home.clickOutDoorProducts();
        home.clickFurnture();
        product.addFavProduct();
    }

    @And("Click {string} to open Favorite page")
    public void clickViewToOpenFavoritePage(String arg0) {
        product.viewFavProducts();
    }

    @Then("Ensure product is displayed")
    public void ensureProductIsDisplayed() {
        fav.existProduct();
    }

    @And("Remove product from favorites")
    public void removeProductFromFavorites() {
        fav.click3dots();
        fav.delProduct();
        fav.removeProduct();
    }
}
