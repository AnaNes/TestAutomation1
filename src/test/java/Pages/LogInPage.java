package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {

  WebDriver driver;
  WebDriverWait wdwait;

  WebElement username;
  WebElement password;
  WebElement logInButton;

    public LogInPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.cssSelector(".input_error.form_input"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.name("password"));
    }

    public WebElement getLogInButton() {
        return driver.findElement(By.id("login-button"));
    }

    public void insertUsername (){
        this.getUsername().clear();
        this.getUsername().sendKeys("standard_user");

    }

    public void insertPassword(){
        this.getPassword().clear();
        this.getPassword().sendKeys("secret_sauce");
    }

    public void clickOnLoginButton(){
        this.getLogInButton().click();
    }
}
