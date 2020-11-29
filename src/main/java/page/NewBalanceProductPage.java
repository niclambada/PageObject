package page;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.WaitElementMethod;

public class NewBalanceProductPage extends  NewBalanceShopPage {

    public NewBalanceProductPage(WebDriver driver) {
        super(driver);
    }

    public NewBalanceProductPage selecSneakersSize() {
        WebElement selectSize = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//span[contains(@class, 'swatch-8-5')]"), WAIT_TIME_SECONDS);
        selectSize.click();
        return this;
    }

    public String getSe(String actualSize) {
        //String actualSize = actualSize;
        //WebElement selectedSize = WaitElementMethod.waitForElementLocatedBy("")
       // return
    }

    public String getSneakersName(String name) {
        WebElement sneakersName = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//h1[@class = 'product_title entry-title' and text() ='New Balance 574 Dark']"), WAIT_TIME_SECONDS);
        return sneakersName.getText();
    }
}
