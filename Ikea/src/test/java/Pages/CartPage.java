package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private final By productQuantityLocator = By.cssSelector("[class=\"_receipt_hcu5x_61\"] [class=\"cart-text cart-typography-body-m cart-text--lighter\"]");

    //Test-Case 16
    private final By getProductPriceLocator = By.xpath("(//span[@class='cart-price__integer'][normalize-space()='29,695'])[1]");
    private final By increaseProductQuantityLocator = By.xpath("(//span[@class='cart-btn__inner'])[1]");
    private final By getProductSubTotal = By.xpath("(//span[@class='cart-price__integer'][normalize-space()='89,085'])[3]");






    public String verifyProductQuantity(){
        return get_text(productQuantityLocator);
    }

    //Test-Case 16
    public double getProductPrice(){
        return getPrice(getProductPriceLocator);
    }
    public void increaseProductQuantity(){
        myClick(increaseProductQuantityLocator);
    }
    public double getProductSUbTotal(){
        return getPrice(getProductSubTotal);
    }


}
