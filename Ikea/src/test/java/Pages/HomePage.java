package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static hooks.Hooks.js;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Test-Case 1
    private final By login_signupLocator = By.xpath("(//span[@class='hnf-btn__inner'])[3]");
    private final By createAccountLocator = By.xpath("(//span[@class='skapa-mvagent-wrapper-prefix-typography-label-m skapa-mvagent-wrapper-prefix-btn__inner'])[2]");
    private final By profileLocator = By.xpath("(//h2[normalize-space()='Your profile'])[1]");

    //Test-Case 3
    private final By searchbarLocator = By.cssSelector("[id=\"ikea-search-input\"]");
    private final By searchBtnLocator = By.cssSelector("[type=\"submit\"]");

    //Test-Case 4
    private final By productDetailsLocator1 =By.xpath("//span[normalize-space()='Hat and coat stand, 169 cm']");

    //Test-Case 5
    private final By lightiningCatgLocator = By.xpath("(//a[@role='button'])[17]");
    private final By lampsLocator = By.cssSelector("[href=\"https://www.ikea.com/eg/en/cat/lamps-li002/\"]");

    //Test-Case 6
    private final By productsCatgLocator = By.xpath("(//button[normalize-space()='Products'])[1]");
    private final By outdoorProductsLocator = By.xpath("(//span[normalize-space()='Outdoor products'])[1]");
    private final By furntureLocator = By.xpath("(//a[normalize-space()='Outdoor furniture'])[1]");

    //Test-Case 9
    private final By termsAndConditionsBtnLocator = By.xpath("(//a[@class='hnf-link'][normalize-space()='Terms and conditions'])[1]");
    private final By textTermsAndConditionLocator = By.xpath("(//h1[normalize-space()='Terms and conditions'])[1]");

    //Test-Case 10
    private final By languageBtnLocator = By.xpath("(//a[@aria-label='Change language or country/region, current language is English'])[1]");
    private final By arabicLanguageBtnLocator = By.xpath("(//span[@class='hnf-typography-label-s hnf-btn__inner'])[11]");
    private final By arabicTextLocator = By.xpath("(//span[@class='hnf-btn__inner'])[3]");

    //Test-Case 11
    private final By moreCatgBtnLocator = By.xpath("(//button[normalize-space()='More'])[1]");
    private final By storesOptionLocator = By.xpath("(//a[@class='hnf-link'][normalize-space()='Stores'])[1]");
    private final By storeLocator = By.xpath("(//img[@alt='ikea cfc'])[1]");
    private final By verifyStoreLocator = By.xpath("(//div[@class='hnf-store__container__block hnf-store__container__block--address-4'])[1]");

    //Test-Case 13
    private final By bedsCatgLocator = By.xpath("(//span[normalize-space()='Beds & mattresses'])[1]");
    private final By bedsOptionLocator = By.xpath("(//a[@class='hnf-link hnf-link--subtle'][normalize-space()='Beds'])[1]");

    //Test-Case 14
    private final By addProductToFavLocator = By.cssSelector("[id=\"alfuttaim-tabbed-carousel-carousel__products-S59553942-80498802-90580655-20568652-30458436-90592125-10458767-90532626-00451304-S99563345-50609873-50345957-80490113-40579697\"] [class=\"alfuttaim-tabbed-carousel-carousel-slide\"] [class=\"pip-btn pip-btn--small pip-btn--icon-tertiary pip-product-compact__add-to-list-button\"]:nth-child(3)");
    private final By favIconBtnLocator = By.xpath("(//span[@class='hnf-btn__inner js-shopping-list-icon'])[1]");
    private final By backToHomePageLocator = By.xpath("(//img[@src='https://www.ikea.com/global/assets/logos/brand/ikea.svg'])[1]");

    //Test-Case 15
    private final By contactusBtnLocator = By.xpath("(//a[@class='hnf-link'][normalize-space()='Contact us'])[2]");
    private final By contactusOptionsLOcator = By.xpath("(//div[@class='hnf-tabs-navigation__textlinks '])[3]");

    //Test-Case 18
    private final By decorationLocator = By.xpath("(//span[contains(text(),'Decoration')])[1]");
    private final By framesAndPicturesOptionLocator = By.xpath("(//a[normalize-space()='Frames & pictures'])[1]");





    //Test-Case 1
    public void openHomepage(){
        navigateTo("https://www.ikea.com/eg/en/");
    }
    public void login_signup(){
        myClick(login_signupLocator);
    }
    public void createAccountBtn(){
        myClick(createAccountLocator);
    }
    public void verifyProfile(){
        exist(profileLocator);
    }
    //Test-Case 3
    public void fillSearch(String product){
        write(searchbarLocator,product);
    }
    public void clickSearchBtn(){
        myClick(searchBtnLocator);
    }
    //Test-Case 4
    public void clickProduct(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(productDetailsLocator1);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public String getProductDetails1(){
        return get_text(productDetailsLocator1);
    }
    //Test-Case 5
    public void ligtiningCategory(){
        myClick(lightiningCatgLocator);
    }
    public void lamp(){
        myClick(lampsLocator);
    }
    //Test-Case 6
    public void  hoverProducts(){
        hover(productsCatgLocator);
    }
    public void clickOutDoorProducts(){
        myClick(outdoorProductsLocator);
    }
    public void clickFurnture(){
        myClick(furntureLocator);
    }
    //Test-Case 9
    public void clickTermsAndCondition(){
        myClick(termsAndConditionsBtnLocator);
    }
    public void getTermsAndConditionText(){
        exist(textTermsAndConditionLocator);
    }
    //Test-Case 10
    public void clickOnLanguage(){
        myClick(languageBtnLocator);
    }
    public void clickArabicLanguage(){
        myClick(arabicLanguageBtnLocator);
    }
    public String arabicText(){
        return get_text(arabicTextLocator);
    }
    //Test-Case 11
    public void clickMoreOption(){
        myClick(moreCatgBtnLocator);
    }
    public void clickStores(){
        myClick(storesOptionLocator);
    }
    public void store(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(storeLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void verifyStore(){
        exist(verifyStoreLocator);
    }

    //test-Case 13
    public void clickBedsCatg(){
        myClick(bedsCatgLocator);
    }
    public void clickBedOption(){
        myClick(bedsOptionLocator);
    }

    //Test-Case 14
    public void addProductToFav(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(addProductToFavLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void clickFavIconBtn(){
        myClick(favIconBtnLocator);
    }
    public void backToHomePage(){
        List<WebElement> popups = driver.findElements(By.cssSelector(".ins-close-button"));
        if (!popups.isEmpty()) {
            popups.get(0).click();
        }
        WebElement element = driver.findElement(backToHomePageLocator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }

    //Tst-Case 15
    public void clickContactUs(){
        myClick(contactusBtnLocator);
    }
    public void verifyContactUsOptions(){
        exist(contactusOptionsLOcator);
    }

    //Test-Case 18
    public void clickDecoration(){
        myClick(decorationLocator);
    }
    public void clickFramesAndPicturesOption(){
        myClick(framesAndPicturesOptionLocator);
    }








}
