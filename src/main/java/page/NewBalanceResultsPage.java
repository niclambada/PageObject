package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.WaitElementMethod;

public class NewBalanceResultsPage extends NewBalanceShopPage {

    private static final String PRODUCT_LINK = "//a[contains(@href, 'ml574nba-d-polubotinki') and h2[text() = '$']]";
    private String sneakersName;

    public NewBalanceResultsPage(WebDriver driver, String sneakersName) {
        super(driver);
        this.sneakersName = sneakersName;
    }

    public NewBalanceProductPage selectProductLink(String name) {
        WebElement productInfoLink = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath(PRODUCT_LINK.replace("$", name)), WAIT_TIME_SECONDS);
        productInfoLink.click();
        return  new NewBalanceProductPage(driver);
    }
}
