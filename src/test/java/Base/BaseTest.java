package Base;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.ProductsPage;
import Pages.LogInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public LogInPage logInPage;
    public ProductsPage productsPage;
    public CartPage cartPage;
    public CheckoutPage checkoutPage;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        logInPage = new LogInPage(driver,wdwait);
        productsPage = new ProductsPage(driver,wdwait);
        cartPage = new CartPage(driver,wdwait);
        checkoutPage = new CheckoutPage(driver,wdwait);

    }

    public void vissibilityWait(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }




    @AfterClass
    public void tearDown(){
        //driver.quit();
        //driver.close();
    }

}


