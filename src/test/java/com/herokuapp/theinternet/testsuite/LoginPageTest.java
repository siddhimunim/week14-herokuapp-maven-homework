package com.herokuapp.theinternet.testsuite;

import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.SecurePage;
import com.herokuapp.theinternet.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    //make obj of the class which we need

    LoginPage loginPage = new LoginPage();
    SecurePage securePage = new SecurePage();
    @Test
    public void mytest(){

    }
    @Test
    public void UserSholdLoginSuccessfullyWithValidCredentials() throws InterruptedException {
       Thread.sleep(1500);
      loginPage.enterUsername1("tomsmith");
      loginPage.enterPassword("SuperSecretPassword!");
      loginPage.clickOnLogin();

       Assert.assertTrue(securePage.varifySecureArea().contains("You logged into a secure area!"));

    }
    @Test
    public void verifyTheUsernameErrorMessage() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.enterUsername1("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLogin();
        String expText ="Your username is invalid!" + "\n×";

        String actText = loginPage.varifyInvalidName();
        Assert.assertEquals(actText,expText,"Not verify");

    }
    @Test
    public void verifyThePasswordErrorMessage() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.enterUsername1("tomsmith");
        loginPage.enterPassword("supersecret");
        loginPage.clickOnLogin();
        String expText ="Your password is invalid!" + "\n×";

        String actText = loginPage.varifyInvalidPassword();
        Assert.assertEquals(actText,expText,"Not verify");


    }


}
