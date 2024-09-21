package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementActions;

public class CustomerDetailsEntryPage {
    //Variables
    WebDriver driver;
    ElementActions elementActions;

    public CustomerDetailsEntryPage(WebDriver driver){
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Locators
    By mobileNumLocator = By.xpath("//input[@name=\"mobileNo\"]");
    By emailLocator = By.xpath("//input[@name=\"email\"]");
    By proceedToPassengerDetailsLocator = By.xpath("//div[@class='navswitchbtn flex-all-c' and contains(text(), 'PROCEED TO passenger detail')]");

    public void enterMobileNo(String mobileNo){
        elementActions.type(mobileNumLocator, mobileNo);
    }
    public void enterEmail(String email){
        elementActions.type(emailLocator, email);
    }
    public void clickOnProceedToPassengerDetailsBtn(){
        elementActions.click(proceedToPassengerDetailsLocator);

    }


}
