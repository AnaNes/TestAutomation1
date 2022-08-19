package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.beans.Visibility;

public class Testing extends BaseTest {

    @BeforeMethod
    public void PagesetUp(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test (priority = 100)
    public void successfulLogin() throws InterruptedException {
    driver.navigate().to("https://www.saucedemo.com/");
    logInPage.insertUsername();
    logInPage.insertPassword();
    vissibilityWait(logInPage.getLogInButton());
    logInPage.clickOnLoginButton();

        Assert.assertTrue(logInPage.getLogInButton().isDisplayed());

    }

    //In this Test I tested Log in

    @Test
    public void addToCart() throws InterruptedException {

        driver.navigate().to("https://www.saucedemo.com/");
        logInPage.insertUsername();
        logInPage.insertPassword();
        vissibilityWait(logInPage.getLogInButton());
        logInPage.clickOnLoginButton();
        Thread.sleep(2000);
        productsPage.clickOnImage();
        vissibilityWait(productsPage.getAddToCartButton());
        productsPage.clickOnAddToCart();
    }

    //In this Test I added 1 product to the Cart

   @Test (priority = 80)
    public void addToCartProducts() throws InterruptedException {
        logInPage.insertUsername();
        logInPage.insertPassword();
        vissibilityWait(logInPage.getLogInButton());
        logInPage.clickOnLoginButton();
        vissibilityWait(productsPage.getImageProduct());
        productsPage.clickOnImage();
        Thread.sleep(2000);
        productsPage.clickOnAddToCart();
        productsPage.clickOnBackToProducts();
        Thread.sleep(2000);
        productsPage.clickOnAnotherImage();
        Thread.sleep(3000);
        productsPage.clickOnAnotherCart();
        productsPage.clickOnBackToProducts();
   }

   //In this test I added 2 products to the Cart


     @Test (priority = 70)
    public void cartPage() throws InterruptedException {
        logInPage.insertUsername();
        logInPage.insertPassword();
        vissibilityWait(logInPage.getLogInButton());
        logInPage.clickOnLoginButton();
        Thread.sleep(2000);
         productsPage.clickOnImage();
         Thread.sleep(2000);
         productsPage.clickOnAddToCart();
         productsPage.clickOnBackToProducts();
         vissibilityWait(productsPage.getAnotherImageProduct());
         productsPage.clickOnAnotherImage();
         Thread.sleep(3000);
         productsPage.clickOnAnotherCart();
         cartPage.clickOnCartButton();

     }
     //In this test I added 2 products to the Cart and went to the Cart Page

     @Test
    public void removeProduct() throws InterruptedException {
         logInPage.insertUsername();
         logInPage.insertPassword();
         Thread.sleep(2000);
         logInPage.clickOnLoginButton();
         Thread.sleep(2000);
         productsPage.clickOnImage();
         Thread.sleep(2000);
         productsPage.clickOnAddToCart();
         productsPage.clickOnBackToProducts();
         Thread.sleep(2000);
         productsPage.clickOnAnotherImage();
         Thread.sleep(3000);
         productsPage.clickOnAnotherCart();
         cartPage.clickOnCartButton();
         cartPage.removeButton();

     }
     //In this Test I removed 1 item from the Cart

     @Test
    public void checkoutButton() throws InterruptedException {
         logInPage.insertUsername();
         logInPage.insertPassword();
         Thread.sleep(2000);
         logInPage.clickOnLoginButton();
         Thread.sleep(2000);
         productsPage.clickOnImage();
         Thread.sleep(2000);
         productsPage.clickOnAddToCart();
         productsPage.clickOnBackToProducts();
         Thread.sleep(2000);
         productsPage.clickOnAnotherImage();
         Thread.sleep(3000);
         productsPage.clickOnAnotherCart();
         cartPage.clickOnCartButton();
         Thread.sleep(2000);
         checkoutPage.clickOnCheckOutButton();
         checkoutPage.inserteFirstName();
         checkoutPage.insertLastName();
         Thread.sleep(2000);
         checkoutPage.insertZipCode();
         checkoutPage.clickOnContinueButton();
         checkoutPage.clickOnFinishButton();
    }

    // In this test I finished my order
    @AfterMethod
    public void removeCookies(){
        driver.manage().deleteAllCookies();
    }
}








