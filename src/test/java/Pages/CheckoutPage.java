package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement checkoutButton;
    WebElement firstName;
    WebElement lastName;
    WebElement zipCode;
    WebElement continueButton;
    WebElement finishButton;


    public CheckoutPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("checkout"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getZipCode() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement getFinishButton() {
        return driver.findElement(By.id("finish"));
    }

    public void inserteFirstName(){
        this.getFirstName().clear();
        this.getFirstName().sendKeys("Ana");
    }

    public void insertLastName(){
        this.getLastName().clear();
        this.getLastName().sendKeys("Nesic");
    }

    public void insertZipCode(){
        this.getZipCode().clear();
        this.getZipCode().sendKeys("11000");

    }

    public void clickOnCheckOutButton(){
        this.getCheckoutButton().click();
    }

    public void clickOnContinueButton(){
        this.getContinueButton().click();
    }

    public void clickOnFinishButton(){
        this.getFinishButton().click();
    }
}
