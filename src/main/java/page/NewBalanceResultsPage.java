package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.WaitElementMethod;

public class NewBalanceResultsPage extends NewBalanceShopPage {

    private String sneakersName;
    public NewBalanceResultsPage(WebDriver driver, String sneakersName) {
        super(driver);
        this.sneakersName = sneakersName;
    }

    public NewBalanceProductPage selectProductLink(String name) {
        WebElement productInfoLink = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//a[contains(@class, 'woocommerce-LoopProduct-link') and h2[text() = '"+name+"']]"), WAIT_TIME_SECONDS);
        productInfoLink.click();
        return  new NewBalanceProductPage(driver);
    }
}
