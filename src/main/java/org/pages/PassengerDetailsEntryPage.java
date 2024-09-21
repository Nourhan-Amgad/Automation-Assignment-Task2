package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementActions;

public class PassengerDetailsEntryPage {
    //Variables
    WebDriver driver;
    ElementActions elementActions;

    public PassengerDetailsEntryPage(WebDriver driver){
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Locators
    By nameLocator = By.xpath("//input[@placeholder='Name']");
    By ageLocator = By.xpath("//input[@value='20']");

    public void enterName(String name){
        elementActions.type(nameLocator, name);
    }
//    public void chooseGender(){
//        elementActions.click();
//    }
    public void enterAge(String age){
        elementActions.type(ageLocator,age);
    }
//    public void chooseConcession(){
//        elementActions.click();
//    }

//    public void clickOnProceedToCheckoutBtn(){
//        elementActions.click();
//
//    }


}
