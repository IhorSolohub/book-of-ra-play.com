package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import pages.base.BasePage;
import pages.contactUs.ContactUsPage;
import pages.main.MainPage;
import pages.onlineCasinos.OnlineCasinosPage;


public class BaseTest {

    public BasePage basePage;
    public MainPage mainPage;
    public OnlineCasinosPage onlineCasinosPage;
    public ContactUsPage contactUsPage;

    public void startDriver (String browser) {
        WebDriver driver = null;
        switch (browser) {
            case "main" :
            case "onlineCasinos" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
            case "contactUs" :
                driver = CommonActions.createDriver("CHROME", 360, 640);
                break;
        }
        basePage = new BasePage(driver);
        mainPage = new MainPage(driver);
        onlineCasinosPage = new OnlineCasinosPage(driver);
        contactUsPage = new ContactUsPage(driver);
    }

    @AfterMethod
    public void clearCookiesAndExit () {
        basePage.clearCookiesAndLocalStorageAndClose();
    }
}
