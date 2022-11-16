package pages.onlineCasinos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class OnlineCasinosPage extends BasePage {

    public OnlineCasinosPage (WebDriver driver) {super(driver);}

    private final By nameInput = By.xpath("//input[@id='author']");
    private final By emailInput= By.xpath("//input[@id='email']");
    private final By commentIInput = By.xpath("//textarea[@id='comment']");
    private final By sendButton = By.xpath("//button[@class='e_ZyAH58 OLnDClmYUXuf']");
    private final By submitMessage = By.xpath("//div[@id='form-message']");

    public OnlineCasinosPage playNowRegButtonClick (int numButton) {
        By readAlsoButton = By.xpath("(//a[contains(@class,'e_ZyAH58 hH0dxsB')])[" + numButton + "]");
        driver.findElement(readAlsoButton).click();
        return this;
    }

    public OnlineCasinosPage enterName (String name) {
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }

    public OnlineCasinosPage enterEmail (String email) {
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public OnlineCasinosPage enterComment (String comment) {
        driver.findElement(commentIInput).sendKeys(comment);
        return this;
    }

    public OnlineCasinosPage submitButtonClick () {
        driver.findElement(sendButton).click();
        return this;
    }

    public Boolean submitMessageVisibleCheck () {
        return elementVisibleCheck(submitMessage);
    }

}
