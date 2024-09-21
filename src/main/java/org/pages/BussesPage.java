package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementActions;

public class BussesPage {
    //Variables
    WebDriver driver;
    ElementActions elementActions;

    public BussesPage(WebDriver driver){
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Locators
    By selectSeatsBtnLocator = By.xpath("//div[text()=\"Select Seats\"]");
    By chooseSpecificSeatLocator = By.xpath("//div[@class='seatlook' and contains(@style, 'cursor: pointer')]");
    By choosePointLocator = By.xpath("//div[@class=\"col-time\"]");
    By chooseDroppingPointLocator = By.xpath("//div[text()='Select Dropping Point']");
    By passengerDetailsLocator = By.xpath("//div[text()=\"Provide Passenger Details\"]");
    //Actions
    public void selectSeats(){
        elementActions.click(selectSeatsBtnLocator);
        elementActions.click(chooseSpecificSeatLocator);
    }
    public void chooseBoardingPoint(){
        elementActions.click(choosePointLocator);

    }
    public void chooseDroppingPoint(){
        elementActions.click(chooseDroppingPointLocator);
        elementActions.click(choosePointLocator);

    }
    public void proceedToPassengerDetails(){
        elementActions.click(passengerDetailsLocator);
    }


}
