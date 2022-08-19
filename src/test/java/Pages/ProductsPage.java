package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement addToCartButton;
    WebElement imageProduct;
    WebElement anotherImageProduct;
    WebElement backToProducts;
    WebElement addToCartImage;


    public ProductsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getImageProduct() {
        return driver.findElement(By.className("inventory_item_img"));
    }

    public WebElement getAnotherImageProduct() {
        return driver.findElement(By.id("item_0_img_link"));
    }

    public WebElement getBackToProducts() {
        return driver.findElement(By.id("back-to-products"));
    }

    public WebElement getAddToCartImage() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }

    public void clickOnImage(){
        this.getImageProduct().click();
    }

    public void clickOnAddToCart(){
        this.getAddToCartButton().click();
    }

    public void clickOnAnotherImage(){
        this.getAnotherImageProduct().click();
    }

    public void clickOnBackToProducts(){
        this.getBackToProducts().click();
    }

    public void clickOnAnotherCart(){
        this.getAddToCartImage().click();
    }

}
