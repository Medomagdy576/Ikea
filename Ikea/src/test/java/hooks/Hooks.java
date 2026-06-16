package hooks;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class Hooks {
    public static WebDriver driver;
    public static Faker faker ;
    SoftAssert soft;
    public static JavascriptExecutor js;

    @Before
    public void removeAds() {
        // 1) Remove OneTrust Cookies Banner
        try {
            WebElement cookieBtn = driver.findElement(By.id("onetrust-accept-btn-handler"));
            if (cookieBtn.isDisplayed()) {
                cookieBtn.click();
                Thread.sleep(500);
            }
        } catch (Exception ignored) {}

        // 2) Remove "INS" advertisement blocks
        try {
            List<WebElement> closeButtons = driver.findElements(
                    By.cssSelector(".ins-close-button, .ins-element-content-close"));
            for (WebElement btn : closeButtons) {
                if (btn.isDisplayed()) {
                    btn.click();
                    Thread.sleep(300);
                }
            }
        } catch (Exception ignored) {}

        // 3) Remove overlays by JS (the strongest method)
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "var overlays = document.querySelectorAll('div[style*=\"z-index\"], .overlay, .modal');" +
                            "overlays.forEach(o => o.remove());"
            );
        } catch (Exception ignored) {}
    }



    @Before
    public void setup(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        faker = new Faker();
        js  = (JavascriptExecutor) driver;
        soft = new SoftAssert();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
