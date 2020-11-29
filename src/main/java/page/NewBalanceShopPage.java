package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.WaitElementMethod;

public abstract class NewBalanceShopPage {

    protected WebDriver driver;
    protected static final String HOMEPAGE_URL = "https://nbalance.by/";
    protected final long WAIT_TIME_SECONDS = 10;

    public NewBalanceShopPage(WebDriver driver) {
        this.driver = driver;
    }

    public NewBalanceShopPage searchForSneakersName(String sneakersName) {
        WebElement searchInputField = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//input[@class = 'yith-s']"), WAIT_TIME_SECONDS);
        searchInputField.sendKeys(sneakersName);
        searchInputField.submit();
        return  null;//
    }
}
