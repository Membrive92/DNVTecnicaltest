package pers.membrive.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    public WebDriver driver;
    public LandingPage(WebDriver driver) {this.driver = driver;}

    By signIn = By.xpath("//*[@data-vlink-type=\"external\" and text() =\"Log in\"]");

    By marketplace = By.xpath("//*[@class=\"vui-header-link text desktop bordered\" and text() =\"Marketplace\"]");

    By cookiesAcceptBtn = By.id("onetrust-accept-btn-handler");

    public WebElement getLogin() {return driver.findElement(signIn);}

    public WebElement getMarketplace() {return driver.findElement(marketplace);}

    public WebElement getCookiesAcceptBtn() {
        return driver.findElement(cookiesAcceptBtn);
    }
}
