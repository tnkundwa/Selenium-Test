package login;


import static org.junit.Assert.*;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SecureAreaPage;
import testautomationu.BaseTests;

public class LoginTests extends BaseTests{

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue("The text is incorrect my nigga!", secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }
    
}