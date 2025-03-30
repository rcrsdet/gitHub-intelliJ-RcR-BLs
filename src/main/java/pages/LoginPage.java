package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    final WebDriver driver;
    final By userNameField = By.id("username");
    final By passwordField = By.id("password");
    final By loginButton = By.xpath("//input[@value='Login']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(userNameField).sendKeys(username);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public AccessingPage clickLoginButton (){
        driver.findElement(loginButton).click();
        return new AccessingPage(driver);
    }

}
