package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static hooks.Hooks.js;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    //Test-Case 4
    private final By itemsforProductLocator = By.xpath("(//span[normalize-space()='Holder for mobile phone, grey'])[1]");

    //test-Case 5
    private final By addProductToTheCartLocator = By.cssSelector("[class=\"plp-product-list__products  plp-product-list__products--compare-enabled\"] [class=\"plp-fragment-wrapper plp-fragment-wrapper--grid\"]:nth-child(14) [type=\"button\"]:nth-child(1)");
    private final By productInfoLocator = By.cssSelector("[alt=\"SVALLET Work lamp, dark grey/white\"]");

    //Test-Case 6
    private final By favProductLocator = By.xpath("(//span[@class='plp-typography-label-s plp-btn__inner'])[2]");
    private final By favBtnLocator = By.xpath("(//span[@class='hnf-typography-label-s hnf-btn__inner'])[10]");

    //Test-Case 7
    private final By goToBagBtnLOcator = By.xpath("(//span[@class='hnf-typography-label-s hnf-btn__inner'])[10]");

    //Test-Case 8
    private final By firstProductPriceBeforeSortLocator = By.cssSelector("[class=\"plp-product-list__products  \"] [class=\"plp-fragment-wrapper plp-fragment-wrapper--grid\"] [data-skapa=\"hyperlink@9.0.2\"] [class=\"plp-price-module__price\"] [class]:nth-child(2)");
    private final By sortLocator = By.xpath("(//button[@class='plp-pill plp-pill--small plp-pill--trailing-icon'])[1]");
    private final By fromLowToHighLocator = By.xpath("(//input[@id='plp-PRICE_LOW_TO_HIGH'])[1]");
    private final By firstProductPriceAfterSortLocator =By.cssSelector("div[class='plp-catalog-product-list'] div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(2) a:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) em:nth-child(1) span:nth-child(1) span:nth-child(1) span:nth-child(2)");

    //Test-Case 11
    private final By productNameLocator = By.xpath("(//span[contains(text(),'KABOMBA')])[1]");
    private final By productPriceLocator = By.xpath("(//span[normalize-space()='6,999'])[1]");

    //Test-Case 13
    private final By matrialFilterLocator = By.xpath("(//button[@class='plp-pill plp-pill--small plp-pill--trailing-icon'])[4]");
    private final By woodMatrialLocator = By.xpath("(//span)[164]");
    private final By priceFilterLocator = By.xpath("(//button[contains(@class,'plp-pill plp-pill--small plp-pill--trailing-icon')])[5]");
    private final By priceRangeLocator = By.xpath("(//span)[169]");
    private final By bedProductNameLocator = By.xpath("(//span[@class='plp-text plp-typography-label-m plp-typography-regular plp-price-module__description'])[1]");
    private final By bedProductPriceLocator = By.xpath("(//span[contains(@class,'plp-price__integer')][normalize-space()='19,795'])[1]");

    //Test-Case 16
    private final By addChairProductLocator = By.xpath("(//span[@class='plp-typography-label-s plp-btn__inner'])[3]");
    private final By goToCartLocator = By.xpath("(//span[contains(@class,'hnf-typography-label-s hnf-btn__inner')])[9]");

    //Test-Case 17
    private final By favProduct2Locator = By.xpath("(//span[@class='plp-typography-label-s plp-btn__inner'])[10]");
    private final By favProduct3Locator = By.xpath("(//span[@class='plp-typography-label-s plp-btn__inner'])[12]");









    //Test-Case 4
    public String verifyProducts(){
        return get_text(itemsforProductLocator);
    }
    //Test-Case 5
    public void addProductToTheCart(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement addProduct = driver.findElement(addProductToTheCartLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", addProduct);
        js.executeScript("arguments[0].click();", addProduct);
    }
    public void openProductDetails(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement Productinfo = driver.findElement(productInfoLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", Productinfo);
        js.executeScript("arguments[0].click();", Productinfo);
    }
    //Test-Case 6
    public void addFavProduct(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(favProductLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void viewFavProducts(){
        myClick(favBtnLocator);
    }
    //Test-Case 7
    public void clickGoToBag(){
        myClick(goToBagBtnLOcator);
    }

    //test-Case 8
    public double getFirstPriceProductBeforeSort(){
        return getPrice(firstProductPriceBeforeSortLocator);
    }
    public void clickSort(){
        myClick(sortLocator);
    }
    public void fromLowTohighSort(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(fromLowToHighLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public double getFirstPriceProductAfterSort(){
        return getPrice(firstProductPriceAfterSortLocator);
    }
    //Test-Case 11
    public String getProductName(){
        return get_text(productNameLocator);
    }
    public double getProductPrice(){
        return getPrice(productPriceLocator);
    }
    public void openProductDetails2(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(productNameLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }

    //Test-Case 13
    public void matrialFilter(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(matrialFilterLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void woodMatrial(){
        myClick(woodMatrialLocator);
    }
    public void priceFilter(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(priceFilterLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void selectPriceRange(){
        myClick(priceRangeLocator);
    }
    public String getBedProductName(){
        return get_text(bedProductNameLocator);
    }
    public double getBedProductPrice(){
        return getPrice(bedProductPriceLocator);
    }

    //Test-Case 16
    public void addChairProduct(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement addProduct = driver.findElement(addChairProductLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", addProduct);
        js.executeScript("arguments[0].click();", addProduct);
    }
    public void goToCart(){
        myClick(goToCartLocator);
    }

    //Test-Case 17
    public void addFavProduct2(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(favProduct2Locator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void addFavProduct3(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(favProduct3Locator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }







}
