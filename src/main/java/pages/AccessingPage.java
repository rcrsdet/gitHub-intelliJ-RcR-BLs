package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessingPage {

    final WebDriver driver;
    final By loggedIn = By.xpath("//a[text()='Logout']");

    public AccessingPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLogoutText(){
        return driver.findElement(loggedIn).getText();
    }
}
