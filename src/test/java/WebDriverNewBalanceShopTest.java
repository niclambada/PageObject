import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.NewBalanceHomePage;
import page.NewBalanceProductPage;

public class WebDriverNewBalanceShopTest {

    private WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void shouldBeSelectedSneakersSizeTest() {
        driver.manage().deleteAllCookies();
        String sneakersName = "New Balance 574 Dark";
        NewBalanceProductPage productPage = new NewBalanceHomePage(driver)
                .openPage()
                .searchForSneakersName(sneakersName)
                .selectProductLink(sneakersName)
                .selectSneakersSize();
        Assert.assertTrue(productPage.getSneakersName(sneakersName).contains("New Balance 574 Dark"));
    }
    @AfterTest(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
