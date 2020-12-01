package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.WaitElementMethod;

public class NewBalanceProductPage extends NewBalanceShopPage{
    public NewBalanceProductPage(WebDriver driver) {
        super(driver);
    }

    public NewBalanceProductPage selectSneakersSize() {
        WebElement sneakersSize = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//span[contains(@class, 'swatch-8-5')]"), WAIT_TIME_SECONDS);
        sneakersSize.click();
        return this;
    }

    public String getSneakersName(String sneakersName) {
        WebElement sneakers = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//h1[@class = 'product_title entry-title' and text() ='"+sneakersName+"']"), WAIT_TIME_SECONDS);
        return sneakers.getText();
    }

    public String actualSizeSelected() {
        WebElement actualSize = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//span[contains(@class, 'selected')]"), WAIT_TIME_SECONDS);
        return actualSize.getText();
    }

    public NewBalanceProductPage addToCart() {
        WebElement cartButton = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//button[contains(@class, 'add-btn')]"), WAIT_TIME_SECONDS);
        cartButton.click();
        return this;
    }
}
