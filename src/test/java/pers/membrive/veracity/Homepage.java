package pers.membrive.veracity;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
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
        login.signin();
    }


    @Test
    public void obtainProduct() throws IOException {
        driver = setupDriver();
        driver.get("https://www.veracity.com");


        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);

        landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin();
        landing.getMarketplace().click();
        marketplace.getTestProduct().click();
        Assert.assertEquals(marketplace.getTestProductTitle().getText(), "Energy Transition Outlook 2021 dataset");
        marketplace.getFreeAccessButton().click();
        marketplace.getTermsBtnAccept().click();
        marketplace.getGoMyDataBtn().click();
        Assert.assertEquals(marketplace.getDataTitleProductObtained().getText(), "ETO 2021");

    }
            /*
    @Test
    public void verifyIndustryCheck() throws IOException {
        driver = setupDriver();
        driver.get("https://www.veracity.com");

        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin();
        landing.getMarketplace().click();
        marketplace.getOilGasCheck().click();
        Assert.assertEquals(marketplace.getOilGasLabel().getText(),"Oil and gas");
        marketplace.getClearAllSpan().click();
    }

    @Test
    public void verifyCategoryCheck() throws IOException {
        driver = setupDriver();
        driver.get("https://www.veracity.com");

        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin();
        landing.getMarketplace().click();
        marketplace.getCyberSecurityCheck().click();
        Assert.assertEquals(marketplace.getCyberSecurityLabel().getText(),"Cyber security");
        marketplace.getClearAllSpan().click();
    }


    @Test
    public void verifyProductTypeCheck() throws IOException {
        driver = setupDriver();
        driver.get("https://www.veracity.com");

        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin();
        landing.getMarketplace().click();
        marketplace.getFreeCheck().click();
        Assert.assertEquals(marketplace.getFreeLabel().getText(), "Free");
        marketplace.getClearAllSpan().click();

    }

    @Test
    public void verifyProviderSelect() throws IOException {
        driver = setupDriver();
        driver.get("https://www.veracity.com");

        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin();
        landing.getMarketplace().click();
        scrollDown(0,500);
        marketplace.getProviderSelect().click();
        marketplace.getOptionProviderSelect().click();
        Assert.assertEquals(marketplace.getProviderSelect().getText(), "Cisco");
        marketplace.getClearAllSpan().click();

    }
    @Test
    public void verifyProductTypeCheck() throws IOException {
        driver = setupDriver();
        driver.get("https://www.veracity.com");

        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin();
        landing.getMarketplace().click();

        marketplace.getSearchInput().click();
        marketplace.getSearchInput().sendKeys("Energy Transition Outlook 2021 dataset");
        marketplace.getSearchInputResult().click();
        Assert.assertEquals(marketplace.getTestProductTitle().getText(), "Energy Transition Outlook 2021 dataset");

    } */


}
