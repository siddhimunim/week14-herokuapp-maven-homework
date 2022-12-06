package com.herokuapp.theinternet.pages;

import com.herokuapp.theinternet.utility.Utility;
import org.openqa.selenium.By;

public class SecurePage extends Utility {
     By verifySecureArea = By.xpath("//div[@id='flash']");


     public String varifySecureArea(){
         return getTextFromElement(verifySecureArea);
     }
}
