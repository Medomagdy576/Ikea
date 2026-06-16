package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static hooks.Hooks.js;
import static org.openqa.selenium.By.cssSelector;

public class SignupPage extends BasePage{
    public SignupPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    private final By firstNameInputLocator = By.xpath("(//input[@id='first-name'])[1]");
    private final By lastNameInputLocator = By.xpath("(//input[@id='last-name'])[1]");
    private final By emailAddressInputLocator = By.xpath("(//input[@id='email'])[1]");
    private final By passwordInputLocator = By.xpath("(//input[@id='password'])[1]");
    private final By privacyCheckboxLocator = By.cssSelector("[id=\"privacy-policy-checkbox\"]");
//    WebElement privacyCheckboxLocator = driver.findElement(cssSelector("[class=\"pp-skapa__checkbox__symbol\"]"));
    private final By createAccountBtnLocator = By.xpath("(//button[@class='pp-skapa__btn pp-skapa__btn--primary pp-skapa__btn--fluid _createAccount_u2m6k_8'])[1]");
    private final By adsLocator = cssSelector("[id=\"ins-wrap-block-16401899775510\"]");
    private final By closeAdsLocator = cssSelector("[id=\"close-button-1454703513202\"]");


    public void fillFirstName(String fname){
        write(firstNameInputLocator,fname);
    }

    public void fillLastName(String lname){
        write(lastNameInputLocator,lname);
    }

    public void fillEmaillAdress(String email){
        write(emailAddressInputLocator,email);
    }

    public void fillPassword(String pass){
        write(passwordInputLocator,pass);
    }

    public void checkPrivacyCheckBox(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement checkbox = driver.findElement(privacyCheckboxLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", checkbox);
        js.executeScript("arguments[0].click();", checkbox);
    }

    public void clickCreateAccount(){
        myClick(createAccountBtnLocator);
    }

    public void closeAds(){

    }

}
