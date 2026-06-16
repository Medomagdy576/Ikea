package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailInputLocator = By.xpath("(//input[@id='login-email'])[1]");
    private final By passwordInputLocator = By.xpath("(//input[@id='login-password'])[1]");
    private final By loginBtnLocator = By.xpath("(//span[@class='skapa-mvagent-wrapper-prefix-typography-label-m skapa-mvagent-wrapper-prefix-btn__inner'])[1]");
    private final By dashboardLocator = By.xpath("(//h2[normalize-space()='Your profile'])[1]");


    public void fillEmail(String email){
        write(emailInputLocator, email);
    }
    public void fillPass(String pass){
        write(passwordInputLocator,pass);
    }
    public void clickLoginBtn(){
        myClick(loginBtnLocator);
    }
    public void verifyLogin(){
        exist(dashboardLocator);
    }



}
