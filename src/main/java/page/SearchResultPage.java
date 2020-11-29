package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.WaitElementMethod;

public class SearchResultPage extends NewBalanceShopPage {

    private String sneakersName;

    public SearchResultPage(WebDriver driver, String sneakersName) {
        super(driver);
        this.sneakersName = sneakersName;
    }

    public NewBalanceProductPage selectProductLink(String sneakersName) {
        WebElement productLink = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//a[contains(@class, 'woocommerce-LoopProduct-link') and h2[text() = 'New Balance 574 Dark']]"), WAIT_TIME_SECONDS);
        return  new NewBalanceProductPage(driver);
    }
}
