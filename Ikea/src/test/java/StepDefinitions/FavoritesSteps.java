package StepDefinitions;

import Pages.FavouritsPage;
import Pages.HomePage;
import Pages.ProductsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static hooks.Hooks.driver;

public class FavoritesSteps {
    HomePage home = new HomePage(driver);
    FavouritsPage fav = new FavouritsPage(driver);
    ProductsPage product = new ProductsPage(driver);
    Actions actions = new Actions(driver);
    boolean[] a;




    @Given("The User is on home Page {string}")
    public void theUserIsOnHomePage(String arg0) {
        home.openHomepage();
    }

    @When("The user pick a product and Click on Add to Favorite.")
    public void theUserClickOnAddToFavoriteHeartIcon() {
//        home.addProductToFav();
        home.hoverProducts();
        home.clickOutDoorProducts();
        home.clickFurnture();
        product.addFavProduct();
    }

    @And("Navigate to another page")
    public void navigateToAnotherPage() {
        home.backToHomePage();
    }

    @And("Return to Favorite Page")
    public void returnToFavoritePage() {
        home.clickFavIconBtn();
    }

    @Then("Verify that the previously added product is still displayed")
    public void verifyThatThePreviouslyAddedProductIsStillDisplayed() {
        fav.productExist();
    }

    @When("Remove the product from favorites.")
    public void removeTheProductFromFavorites() {
        System.out.println(fav.productExist());
        fav.clickdots();
        fav.removefavBtn();
        fav.clickSureRemove();
        System.out.println(fav.productExist());
    }

    @Then("Verify it no longer appears in the Favorites list.")
    public void verifyItNoLongerAppearsInTheFavoritesList() {

        Assert.assertFalse(fav.productExist(),"This Product is still in the Favorite");
    }
}
