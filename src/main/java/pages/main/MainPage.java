package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {super(driver);}

    private final By realPlayRegButton = By.xpath("//a[@class='hJc4u']");
    private final By readMoreCommentsButton = By.xpath("//button[@class='e_ZyAH58 OLnDClmYUXuf js-showner-more']");
    private final By comment = By.xpath("(//li[@class='aKnY5Ez-it JILVqiU3M yKYLZ'])[9]");
    private final By nameInput = By.xpath("//input[@id='author']");
    private final By emailInput= By.xpath("//input[@id='email']");
    private final By commentIInput = By.xpath("//textarea[@id='comment']");
    private final By sendButton = By.xpath("//button[@class='e_ZyAH58 OLnDClmYUXuf']");
    private final By submitMessage = By.xpath("//div[@id='form-message']");

    public MainPage realPlayRegButtonClick () {
        driver.findElement(realPlayRegButton).click();
        return this;
    }

    public MainPage playForMoneyRegButtonClick (int numButton) {
        By readAlsoButton = By.xpath("(//a[contains(@class,'X5ROmfzQ')])[" + numButton + "]");
        driver.findElement(readAlsoButton).click();
        return this;
    }

    public MainPage top5CasinoReviewRegButtonClick (int numButton) {
        By readAlsoButton = By.xpath("(//a[contains(@class,'d-Z7X')])[" + numButton + "]");
        driver.findElement(readAlsoButton).click();
        return this;
    }

    public MainPage lastArticlesReadMoreButtonClick (int numButton) {
        By readAlsoButton = By.xpath("(//a[contains(@class,'mEe2BnwRS')])[" + numButton + "]");
        driver.findElement(readAlsoButton).click();
        return this;
    }

    public MainPage readMoreCommentsButtonClick () {
        driver.findElement(readMoreCommentsButton).click();
        return this;
    }

    public boolean commentCheck () {
        return elementVisibleCheck(comment);
    }

    public MainPage enterName (String name) {
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }

    public MainPage enterEmail (String email) {
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public MainPage enterComment (String comment) {
        driver.findElement(commentIInput).sendKeys(comment);
        return this;
    }

    public MainPage submitButtonClick () {
        driver.findElement(sendButton).click();
        return this;
    }

    public Boolean submitMessageVisibleCheck () {
        return elementVisibleCheck(submitMessage);
    }

}
