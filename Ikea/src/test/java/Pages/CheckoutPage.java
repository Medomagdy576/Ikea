package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static hooks.Hooks.js;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    //Test-Case 7
    private final By fullNameLocator = By.xpath("(//input[@id='NewAddress_FirstName'])[1]");
    private final By governorateLocator = By.xpath("(//select[@id='NewAddress_AreaId'])[1]");
    private final By areaLocator = By.xpath("(//select[@id='NewAddress_CityAreaId'])[1]");
    private final By emailLocator= By.xpath("(//input[@id='NewAddress_Email'])[1]");
    private final By phoneLocator = By.xpath("(//input[@id='NewAddress_PhoneNumber'])[1]");
    private final By addressLocator = By.xpath("(//input[@id='NewAddress_Address1'])[1]");
    private final By continueBtnLocator1 = By.xpath("(//button[@id='billingSubmitButton'])[1]");
    private final By deliveryDateLocator = By.xpath("(//a[normalize-space()='3'])[1]");
    private final By continueBtnLocator2 = By.xpath("(//button[@id='deliveryAndAssemblyContinue'])[1]");
    private final By paymentMehtodLocator = By.xpath("(//span[@class='checkmark'])[1]");
    private final By payBtnLocator = By.cssSelector("[class=\"iframBody\"] [class=\"iframeBtn\"]");

    private final By cardNumberLocator = By.cssSelector("[class=\"iframBody\"] [placeholder=\"Card Number\"]");





    //Test-Case 7
    public void fillFullName(String name){
        write(fullNameLocator,name);
    }
    public void selectGover(int index){
        select(governorateLocator,index);
    }
    public void selectArea(int index){
        select(areaLocator,index);
    }
    public void fillEmail(String email){
        write(emailLocator,email);
    }
    public void fillPhone(String phone){
        write(phoneLocator,phone);
    }
    public void fillAddress(String address){
        write(addressLocator,address);
    }
    public void clickContinueBtn1(){
        myClick(continueBtnLocator1);
    }
    public void deliveryDate(){
        myClick(deliveryDateLocator);
    }
    public void clickContinueBtn2(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(continueBtnLocator2);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void choosePaymentMethod(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(paymentMehtodLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void clickPayBtn(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(payBtnLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void fillCardNumber(){
        WebElement element = driver.findElement(cardNumberLocator);
        String msg = element.getAttribute("validationMessage");
        Assert.assertTrue(msg.contains("fill"), "Validation message is missing!");


    }








}
