package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.WaitElementMethod;

public class NewBalanceCartPage extends NewBalanceShopPage {
    public NewBalanceCartPage(WebDriver driver) {
        super(driver);
    }

    public double getCartOrderTotal() {
        WebElement cartOrderTotal = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//strong//span[@class ='woocommerce-Price-amount amount']"), WAIT_TIME_SECONDS);
        return Double.parseDouble(cartOrderTotal.getText().replace(" BYN", ""));
    }

    public boolean getSneakersNameAndSizeFromCart(String sneakersName, String selectedSize) {
        WebElement sneakers = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//a[contains(@href, 'razmer=8-5')]"), WAIT_TIME_SECONDS);
        if(sneakers.getText().trim().contains(sneakersName) && sneakers.getText().trim().contains(selectedSize)){
            return true;
        }
            return false;
    }

    public int getCountOfSneakers() {
        WebElement sneakersCount = WaitElementMethod.waitForElementLocatedBy(driver,
                By.xpath("//a[contains(@href, 'razmer=8-5')]//../strong[@class = 'product-quantity']"), WAIT_TIME_SECONDS);
        return Integer.parseInt(sneakersCount.getText().replace("× ", ""));
    }
}
