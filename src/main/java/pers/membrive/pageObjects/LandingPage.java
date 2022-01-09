package pers.membrive.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }


    By signIn = By.xpath("//*[@data-vlink-type=\"external\" and text() =\"Log in\"]");

    By marketplace = By.xpath("//*[@class=\"vui-header-link text desktop bordered\" and text() =\"Marketplace\"]");

    By article = By.xpath("//a[@data-isvideo= \"false\"]//*[contains(text(), 'CSBL and Veracity streamline Charter Party documentation with maritime e-signature solution')]");

    By storyVideo = By.xpath("//a[@data-isvideo= \"true\"]//h3[contains(text(),'Neptune Energy digitalized their simultaneous operations in eight weeks')]");

    By cookiesAcceptBtn = By.id("onetrust-accept-btn-handler");


    public WebElement getLogin() {

        return driver.findElement(signIn);
    }

    public WebElement getMarketplace() {

        return driver.findElement(marketplace);
    }

    public WebElement getArticle() {

        return driver.findElement(article);
    }

    public WebElement getStoryVideo() {

        return driver.findElement(storyVideo);
    }

    public WebElement getCookiesAcceptBtn() {
        return driver.findElement(cookiesAcceptBtn);
    }


}
