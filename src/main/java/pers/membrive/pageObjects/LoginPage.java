package pers.membrive.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By emailInput = By.id("username");

    By continueButton = By.id("continue");

    By passwordInput = By.id("password");

    By loginButton = By.id("next");


    //add login method
    public void signin(String user, String password) throws IOException {


        getEmailInput().sendKeys(user);
        getContinueButton().click();
        getPasswordInput().sendKeys(password);
        getLoginButton().click();
    }

    public void loginData() throws IOException {

    }


    public WebElement getEmailInput() {

        return driver.findElement(emailInput);
    }

    public WebElement getContinueButton() {

        return driver.findElement(continueButton);
    }

    public WebElement getPasswordInput() {

        return driver.findElement(passwordInput);
    }

    public WebElement getLoginButton() {

        return driver.findElement(loginButton);
    }


}
