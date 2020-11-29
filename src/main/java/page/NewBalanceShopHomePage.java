package page;

import org.openqa.selenium.WebDriver;

public class NewBalanceShopHomePage extends NewBalanceShopPage {

    public NewBalanceShopHomePage(WebDriver driver) {
        super(driver);
    }

    public NewBalanceShopHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
}
