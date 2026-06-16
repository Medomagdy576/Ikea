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

public class MultipleFavSteps {
    HomePage home = new HomePage(driver);
    ProductsPage product = new ProductsPage(driver);
    FavouritsPage fav = new FavouritsPage(driver);





    @Given("The User Opens the URL {string}")
    public void theUserOpensTheURL(String arg0) {
        home.openHomepage();
    }

    @When("The user Add {int} random products to favorites")
    public void theUserAddRandomProductsToFavorites(int arg0) {
        home.ligtiningCategory();
        home.lamp();
        product.addFavProduct();
        product.addFavProduct2();
        product.addFavProduct3();
    }

    @And("Navigate to Favorites page")
    public void navigateToFavoritesPage() {
        product.viewFavProducts();
    }

    @Then("Verify all {int} products are listed")
    public void verifyAllProductsAreListed(int arg0) {
        fav.productExist();
        fav.productExist2();
        fav.productExist3();
    }

    @When("Remove {int} product from favorites")
    public void removeProductFromFavorites(int arg0) {
        fav.removeOneProduct();
    }

    @Then("Verify remaining {int} are still listed")
    public void verifyRemainingAreStillListed(int arg0) {
        fav.productExist();
        fav.productExist2();
    }

}
