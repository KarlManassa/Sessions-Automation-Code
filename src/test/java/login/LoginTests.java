package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        var secureAreaPage = loginPage.clickLoginButton();
        String message = secureAreaPage.getMessage();
        assertTrue(message.contains("You logged into a secure area!"),
                "You didn't login");
    }
}