package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement cartButton;
    WebElement removeButton;

    public CartPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCartButton() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    public WebElement getRemoveButton() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    public void clickOnCartButton(){
        this.getCartButton().click();
    }

    public void removeButton(){
        this.getRemoveButton().click();
    }
}
