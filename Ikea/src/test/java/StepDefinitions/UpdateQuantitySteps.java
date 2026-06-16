package StepDefinitions;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static hooks.Hooks.driver;

public class UpdateQuantitySteps {
    HomePage home = new HomePage(driver);
    ProductsPage product = new ProductsPage(driver);
    CartPage cart = new CartPage(driver);



    @Given("open the URL {string}")
    public void openTheURL(String arg0) {
        home.openHomepage();
    }

    @When("The user Search for {string}")
    public void theUserSearchForChair(String arg0) {
        home.fillSearch("Chair");
        home.clickSearchBtn();
    }

    @And("Add one product to the cart")
    public void addOneProductToTheCart() {
        product.addChairProduct();

    }

    @And("In cart, update quantity from {int} → {int}")
    public void inCartUpdateQuantityFrom(int arg0, int arg1) {
        product.goToCart();
        cart.getProductPrice();
        cart.increaseProductQuantity();
        cart.increaseProductQuantity();
    }

    @Then("Verify subtotal = unit price × {int}")
    public void verifySubtotalUnitPrice(int arg0) {
        cart.getProductSUbTotal();
        Assert.assertEquals(cart.getProductPrice() * 3,cart.getProductSUbTotal());
    }



}
