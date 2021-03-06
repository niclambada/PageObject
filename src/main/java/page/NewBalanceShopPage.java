package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.WaitElementMethod;

public abstract class NewBalanceShopPage {

    protected WebDriver driver;
    protected static final String HOME_URL = "https://nbalance.by/";
    protected final long WAIT_TIME_SECONDS = 10;

    public NewBalanceShopPage(WebDriver driver) {
        this.driver = driver;
    }

    public NewBalanceResultsPage searchForSneakersName(String sneakersName) {
        WebElement searchInputField = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//input[@class = 'yith-s']"), WAIT_TIME_SECONDS);
        searchInputField.sendKeys(sneakersName);
        searchInputField.submit();
        return  new NewBalanceResultsPage(driver, sneakersName);
    }

    public NewBalanceCartPage openCart() {
        WebElement cartButton = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//a[@class = 'wpmenucart-contents']"), WAIT_TIME_SECONDS);
        cartButton.click();
        return new NewBalanceCartPage(driver);
    }
}
