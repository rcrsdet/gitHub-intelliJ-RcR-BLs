package login;

import org.testng.annotations.Test;
import pages.AccessingPage;
import pages.LoginPage;
import base.BaseTests;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccesfullLogin(){
        LoginPage loginPage = homePage.clickAuthentication();
        loginPage.setUsername("admin");
        loginPage.setPasswordField("admin");
        AccessingPage accessingPage = loginPage.clickLoginButton();
        assertEquals(accessingPage.getLogoutText(),"Logout","Alert something went wrong..!!");
    }
}
