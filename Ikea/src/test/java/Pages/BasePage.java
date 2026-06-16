package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static hooks.Hooks.js;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait exwait;
    protected Actions action;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        exwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        action = new Actions(driver);
    }


    public void myClick(By locator){
        WebElement element = exwait.until(ExpectedConditions.elementToBeClickable(locator));
        action.moveToElement(element).perform();
        element.click();
    }



    public void write(By locator, String value){
        WebElement element = exwait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }

    public void hover(By locator){
        WebElement element = exwait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        action.moveToElement(element).perform();
    }

    public String get_text(By locator){
        String element =  driver.findElement(locator).getText();

        return element;
    }

    public String getAttribute (By locator, String attribute){
        WebElement element = exwait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getAttribute(attribute);
    }

    public void select(By locator, int value){
        List<WebElement> options = driver.findElements(locator);

        for (WebElement option : options){
            Select select_months = new Select(option);
            select_months.selectByIndex(value);
            option.click();
        }
    }

    public void exist(By locator){
        WebElement element = driver.findElement(locator);
        Assert.assertTrue(element.isDisplayed());
    }


    public void navigateTo(String url){
        driver.get(url);
    }

    public String getAlertText(){
        exwait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();

        return text;
    }

    public void newtab(By locator){
        WebElement element = exwait.until(ExpectedConditions.elementToBeClickable(locator));

        action.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.getLast());
    }

    public double getPrice(By loctaor){
        WebElement element = driver.findElement(loctaor);
        String priceText = element.getText();
        String clean = priceText.replaceAll("[^0-9.]", "");
        return Double.parseDouble(clean);

    }
}

