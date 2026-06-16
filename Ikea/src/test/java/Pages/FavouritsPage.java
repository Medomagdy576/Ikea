package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavouritsPage extends BasePage{
    public FavouritsPage(WebDriver driver) {
        super(driver);
    }

    //Test-Case 6
    private final By productLocator = By.xpath("(//section[@class='_product_1510q_9 _flex_1510q_133 _wrap_1510q_163 _productBuyOnline_1510q_12'])[1]");
    private final By dotsLocator = By.xpath("(//span[@class='fav-typography-label-s fav-btn__inner'])[8]");
    private final By delBtnLocator = By.xpath("(//span[contains(text(),'Remove item')])[1]");
    private final By removeBtnLocator = By.xpath("(//span[@class='fav-btn__label'][normalize-space()='Remove'])[1]");

    //Test-Case 14
    private final By existProductLocator = By.xpath("(//img[@class='fav-image lessPadding'])[1]");
    private final By clickdotsLocator = By.xpath("(//*[name()='svg'][@class='fav-svg-icon fav-btn__icon'])[1]");
    private final By removeLocator = By.xpath("(//span[contains(text(),'Remove list')])[1]");
    private final By sureRemoveLocator = By.xpath("(//span[@class='fav-btn__label'][normalize-space()='Remove'])[1]");

    //Test-Case 17
    private final By existProduct2Locator = By.xpath("(//article[@class='_main_1510q_1'])[2]");
    private final By existProduct3Locator = By.xpath("(//article[@class='_main_1510q_1'])[3]");
    private final By removeProductLocator = By.xpath("(//span[@class='fav-typography-label-s fav-btn__inner'])[6]");





    public void existProduct(){
        exist(productLocator);
    }
    public void click3dots(){
        myClick(dotsLocator);
    }
    public void delProduct(){
        myClick(delBtnLocator);
    }
    public void removeProduct(){
        myClick(removeBtnLocator);
    }

    //Test-Case 14
    public boolean productExist(){
        exist(existProductLocator);
        return false;
    }
    public void clickdots(){
        myClick(clickdotsLocator);
    }
    public void removefavBtn(){
        myClick(removeLocator);
    }
    public void clickSureRemove(){
        myClick(sureRemoveLocator);
    }

    //Test-Case 17
    public void productExist2(){
        exist(existProduct2Locator);
    }
    public void productExist3(){
        exist(existProduct3Locator);
    }
    public void clickProduct(){
        myClick(existProductLocator);
    }
    public void removeOneProduct(){
        myClick(removeProductLocator);
    }






}
