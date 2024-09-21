package org.tests;

import org.openqa.selenium.WebDriver;
import org.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utils.BrowserAction;
import org.utils.BrowserFactory;
import org.utils.JsonFileManager;

import java.io.FileNotFoundException;

public class BookASeatTest {
    //variables
    WebDriver driver;
    HomePage homePage;
    JsonFileManager jsonFileManager;
    BussesPage bussesPage;
    CustomerDetailsEntryPage customerDetailsEntryPage;
    PassengerDetailsEntryPage passengerDetailsEntryPage;

    //Tests
    @Test
    public void chooseBusTest(){
       homePage.chooseDeparture();
       homePage.chooseDestination();
       homePage.chooseArrivalDate();
       homePage.clickOnSearchButton();
       bussesPage.selectSeats();
       bussesPage.chooseBoardingPoint();
       bussesPage.chooseDroppingPoint();
       bussesPage.proceedToPassengerDetails();
       customerDetailsEntryPage.enterMobileNo("6789125987");
       customerDetailsEntryPage.enterEmail("XYZ@gmail.com");
       customerDetailsEntryPage.clickOnProceedToPassengerDetailsBtn();
       passengerDetailsEntryPage.enterName("Lydiaa");
       passengerDetailsEntryPage.enterAge("30");
    }

    //Configurations
    @BeforeMethod
    public void setUp() throws FileNotFoundException {
        jsonFileManager = new JsonFileManager("src/test/java/org/testData/BookASeatTestData.json");
        driver = BrowserFactory.getBrowser(jsonFileManager.getTestData("browserName"));
        BrowserAction.navigateToUrl(driver,jsonFileManager.getTestData("url"),jsonFileManager.getTestData("ScreenWidth"),jsonFileManager.getTestData("ScreenHeight"));
        homePage = new HomePage(driver);
        bussesPage = new BussesPage(driver);
        customerDetailsEntryPage = new CustomerDetailsEntryPage(driver);
        passengerDetailsEntryPage = new PassengerDetailsEntryPage(driver);
    }

    @AfterMethod
    public void tearDown(){
      BrowserAction.closeAllBrowserTabs(driver);
    }
}
