package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static hooks.Hooks.js;

public class ProductDetailsPage extends BasePage{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }


    //Test-Case 4
    private final By productDetailsLocator2 = By.cssSelector("[class=\"pipf-price-package__price-module-wrapper\"] [class=\"pipcom-text pipcom-typography-label-l pipcom-typography-regular pipcom-price-module__description\"]");
    //Test-Case 5
    private final By productAddToCart = By.xpath("(//span[@class='pipf-typography-label-m pipf-btn__inner'])[1]");
    private final By shoopingBagLocator = By.xpath("(//span[contains(text(),'Go to shopping bag')])[1]");
    //Test-Case 7
    private final By checkoutBtnLocator = By.xpath("(//span[contains(text(),'Go to checkout')])[1]");
    //test-Case 11
    private final By productNameLocator = By.xpath("(//span[@class='pipcom-price-module__name-decorator notranslate'])[1]");
    private final By productPriceLocator = By.xpath("(//span[@class='pipcom-price__integer'])[1]");







    //Test-Case 4
    public String getProductDetails2(){
        return get_text(productDetailsLocator2);
    }

    //Test-Case 5
    public void addProductToTheCart(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement addProduct = driver.findElement(productAddToCart);
        js.executeScript("arguments[0].scrollIntoView(true);", addProduct);
        js.executeScript("arguments[0].click();", addProduct);
    }
    public void clickOnShoopingBag(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement shoopingbag = driver.findElement(shoopingBagLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", shoopingbag);
        js.executeScript("arguments[0].click();", shoopingbag);
    }

    //Test-Case 7
    public void clickCheckout(){
        myClick(checkoutBtnLocator);
    }

    //Test-Case 11
    public String getProductName(){
        return get_text(productNameLocator);
    }
    public double getProductPrice(){
        return getPrice(productPriceLocator);
    }



}
