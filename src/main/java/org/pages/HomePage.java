package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementActions;

public class HomePage {
    //Variables
    WebDriver driver;
    ElementActions elementActions;

    public HomePage(WebDriver driver){
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Locators
    By departureLocator = By.xpath("//span[text()=\"Select Departure City\"]");
    By inputFieldLocator = By.xpath("//input[@placeholder='Search Your City Name']");
    By optionLocator = By.xpath( "//ul[@class='chosen-results']//li[@data-option-array-index='110']");


    By destinationLocator = By.xpath("//span[text()=\"Select Destination City\"]");
    By secondInputFieldLocator = By.xpath("(//input[@placeholder='Search Your City Name'])[2]");
    By secondOptionLocator = By.xpath( "//ul[@class='chosen-results']//li[@data-option-array-index='13'][em]");

    By arrivalDateLocator = By.id("departDate");
    By specificDayLocator = By.xpath("//a[text()=\"30\"]");
    By searchBussesBtnLocator = By.id("submitSearch");
    //Actions
    public void chooseDeparture(){
        elementActions.click(departureLocator);
        elementActions.type(inputFieldLocator, "CHIKKAMAGALURU");
        elementActions.click(optionLocator);
    }
    public void chooseDestination(){
        elementActions.click(destinationLocator);
        elementActions.type(secondInputFieldLocator, "BENGALURU");
        elementActions.click(secondOptionLocator);
    }
    public void chooseArrivalDate(){
       elementActions.click(arrivalDateLocator);
       elementActions.click(specificDayLocator);
    }
    public void clickOnSearchButton(){
        elementActions.click(searchBussesBtnLocator);
    }

}
