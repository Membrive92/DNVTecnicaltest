package pers.membrive.veracity;

import org.testng.annotations.Test;
import pers.membrive.pageObjects.LandingPage;
import pers.membrive.pageObjects.LoginPage;
import pers.membrive.pageObjects.MarketplacePage;

import java.io.IOException;

public class Homepage extends Base {



    @Test
    public void login() throws IOException {
        driver = setupDriver();
        driver.get("https://www.veracity.com");

        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);

        landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.getEmailInput().sendKeys("membri_2@hotmail.com");
        login.getContinueButton().click();
        login.getPasswordInput().sendKeys("PruebatecnicaM99");
        login.getLoginButton().click();
    }



    @Test
    public void navigateToBase() throws IOException {
        driver = setupDriver();
        driver.get("https://www.veracity.com");

        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);

        landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.getEmailInput().sendKeys("membri_2@hotmail.com");
        login.getContinueButton().click();
        login.getPasswordInput().sendKeys("PruebatecnicaM99");
        login.getLoginButton().click();
        landing.getMarketplace().click();
        marketplace.getTestProduct().click();
        marketplace.getFreeAccessButton().click();
        marketplace.getTermsBtnAccept().click();
        marketplace.getGoMyDataBtn();

    }





}
