package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    final WebDriver driver;
    final By authenticationLink = By.xpath("//a[text()='Login']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickAuthentication(){

        driver.findElement(authenticationLink).click();
        return new LoginPage(driver);
    }
}

