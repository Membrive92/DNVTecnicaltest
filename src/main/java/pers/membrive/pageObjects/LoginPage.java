package pers.membrive.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By emailInput = By.id("username");

    By continueButton = By.id("continue");

    By passwordInput = By.id("password");

    By loginButton = By.id("next");


    public WebElement getEmailInput(){

        return driver.findElement(emailInput);
    }

    public WebElement getContinueButton(){

        return driver.findElement(continueButton);
    }

    public WebElement getPasswordInput(){

        return driver.findElement(passwordInput);
    }

    public WebElement getLoginButton(){

        return driver.findElement(loginButton);
    }


}
