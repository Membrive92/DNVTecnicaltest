package pers.membrive.veracity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pers.membrive.pageObjects.LandingPage;
import pers.membrive.pageObjects.LoginPage;
import pers.membrive.pageObjects.MarketplacePage;
import java.io.IOException;

public class VerifyMarketplaceSelectorsTest extends Base {
    String userEmail;
    String userPass;
    public WebDriver driver;
    public static Logger log ;

    @BeforeTest
    public void initialize() throws IOException
    {
        driver = setupDriver();
        userEmail = props.getProperty("userEmail");
        userPass = props.getProperty("userPassword");
        log = LogManager.getLogger(VerifyMarketplaceSelectorsTest.class.getName());
        log.info("Driver is initialized");
        driver.get(props.getProperty("url"));
        log.info("Navigated to Home page");
    }

    @Test
    public void verifyIndustryCheckTest() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);

        landing.getCookiesAcceptBtn().click();
        log.debug("Cookie alert accepted");
        landing.getLogin().click();
        log.debug("On login window");
        login.signin(userEmail,userPass);;
        landing.getMarketplace().click();
        log.debug("On Marketplace window");
        marketplace.getOilGasCheck().click();
        log.debug("Oil and Gas check clicked");
        Assert.assertEquals(marketplace.getOilGasLabel().getText(), "Oil and gas");
        log.info("Check selected successfully");
        marketplace.getClearAllSpan().click();
        log.debug("All checks have been cleaned");
    }

    @Test
    public void verifyCategoryCheckTest() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);

        landing.getCookiesAcceptBtn().click();
        log.debug("Cookie alert accepted");
        landing.getLogin().click();
        log.debug("On login window");
        login.signin(userEmail,userPass);;
        log.info("login succesful");
        landing.getMarketplace().click();
        log.debug("On Marketplace window");
        marketplace.getCyberSecurityCheck().click();
        log.debug("CyberSecurity check clicked");
        Assert.assertEquals(marketplace.getCyberSecurityLabel().getText(), "Cyber security");
        log.info("Cyber security selected successfully");
        marketplace.getClearAllSpan().click();
        log.debug("All checks have been cleaned");
    }

    @Test
    public void verifyProductTypeCheckTest() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);

        landing.getCookiesAcceptBtn().click();
        log.debug("Cookie alert accepted");
        landing.getLogin().click();
        log.debug("On login window");
        login.signin(userEmail,userPass);;
        log.info("login succesful");
        landing.getMarketplace().click();
        log.debug("On Marketplace window");
        marketplace.getFreeCheck().click();
        log.debug("Free check clicked");
        Assert.assertEquals(marketplace.getFreeLabel().getText(), "Free");
        log.info("Free Check selected successfully");
        marketplace.getClearAllSpan().click();
        log.debug("All checks have been cleaned");
    }

    @Test
    public void verifyProviderSelectTest() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);

        landing.getCookiesAcceptBtn().click();
        log.debug("Cookie alert accepted");
        landing.getLogin().click();
        log.debug("On login window");
        login.signin(userEmail,userPass);;
        log.info("login succesful");
        landing.getMarketplace().click();
        log.debug("On Marketplace window");
        scrollDown(0, 500);
        log.debug("scroll down on page");
        marketplace.getProviderSelect().click();
        log.debug("Provider Select clicked");
        marketplace.getOptionProviderSelect().click();
        log.debug("Cisco Option selected");
        Assert.assertEquals(marketplace.getProviderSelect().getText(), "Cisco");
        log.info("Cisco Option selected successfully");
        marketplace.getClearAllSpan().click();
        log.debug("All checks have been cleaned");
    }

    @Test
    public void verifySearcherTest() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);

        landing.getCookiesAcceptBtn().click();
        log.debug("Cookie alert accepted");
        landing.getLogin().click();
        log.debug("On login window");
        login.signin(userEmail,userPass);
        log.info("login succesful");;
        landing.getMarketplace().click();
        log.debug("On Marketplace window");
        marketplace.getSearchInput().click();
        log.debug("Searcher clicked");
        marketplace.getSearchInput().sendKeys("Energy Transition Outlook 2021 dataset");
        log.debug("Energy Transition Outlook 2021 dataset typed on searcher");
        marketplace.getSearchInputResult().click();
        log.debug("clicked on product result");
        Assert.assertEquals(marketplace.getTestProductTitle().getText(), "Energy Transition Outlook 2021 dataset");
        log.info("the product clicked is right!");
    }

    @AfterTest
    public void teardown() {driver.quit();}
}
