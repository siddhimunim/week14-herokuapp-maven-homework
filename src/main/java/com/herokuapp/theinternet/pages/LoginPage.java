package com.herokuapp.theinternet.pages;

import com.herokuapp.theinternet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
//login into main page //
    By userName = By.name("username");
    By password = By.xpath("//input[@id='password']");
    By loginLink = By.xpath("//body/div[2]/div[1]/div[1]/form[1]/button[1]");

    By verifyInvalidUserName = By.xpath("//div[@id='flash']");
    By verifyInvalidPassword = By.xpath("//div[@id='flash']");

    public void enterUsername1(String name){
      sendTextToElement(userName,name);
  }

  public void enterPassword(String pass){
      sendTextToElement(password,pass);
  }


   public void clickOnLogin(){
       clickOnElement(loginLink);
   }
   public String varifyInvalidName(){
       return getTextFromElement(verifyInvalidUserName);

   }
    public String varifyInvalidPassword(){
        return getTextFromElement(verifyInvalidPassword);

    }


}
