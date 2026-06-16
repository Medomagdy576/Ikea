package StepDefinitions;

import Pages.CartPage;
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

public class AddProductToTheCartSteps {
    HomePage home = new HomePage(driver);
    ProductsPage product = new ProductsPage(driver);
    ProductDetailsPage productdetails = new ProductDetailsPage(driver);
    CartPage cart = new CartPage(driver);



    @Given("User is on Home Page")
    public void UserIsOnHomePage(){
        home.openHomepage();
    }

    @When("User click on the {string} category")
    public void userClickOnTheCategory(String arg0) {
       home.ligtiningCategory();
    }

    @And("User navigate to {string} subcategory")
    public void userNavigateToSubcategory(String arg0) {
        home.lamp();
    }

    @And("User select a random product and add it to the bag")
    public void userSelectARandomProductAndAddItToTheBag() {
        product.addProductToTheCart();
    }

    @And("User open the same product page")
    public void userOpenTheSameProductPage() {
        product.openProductDetails();
    }

    @And("User add the product to the bag again")
    public void userAddTheProductToTheBagAgain() {
        productdetails.addProductToTheCart();
    }

    @And("User open the shopping cart")
    public void userOpenTheShoppingCart() {
        productdetails.clickOnShoopingBag();
    }

    @Then("the quantity of the product in the cart should be {int}")
    public void theQuantityOfTheProductInTheCartShouldBe(int arg0) {
        Assert.assertEquals(cart.verifyProductQuantity(),"Products (2)");
    }
}
