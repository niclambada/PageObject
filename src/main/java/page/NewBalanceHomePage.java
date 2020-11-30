package page;

import org.openqa.selenium.WebDriver;

public class NewBalanceHomePage extends  NewBalanceShopPage {
    public NewBalanceHomePage(WebDriver driver) {
        super(driver);
    }

    public NewBalanceHomePage openPage() {
        driver.get(HOME_URL);
        return this;
    }
}
