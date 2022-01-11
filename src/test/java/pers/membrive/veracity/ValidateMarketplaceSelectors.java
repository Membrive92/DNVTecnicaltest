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

public class ValidateMarketplaceSelectors extends Base {

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
        log = LogManager.getLogger(Base.class.getName());

        log.info("Driver is initialized");
        driver.get(props.getProperty("url"));
        log.info("Navigated to Home page");
    }

    @Test
    public void verifyIndustryCheck() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        //  landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin(userEmail,userPass);;
        landing.getMarketplace().click();
        marketplace.getOilGasCheck().click();
        Assert.assertEquals(marketplace.getOilGasLabel().getText(), "Oil and gas");
        marketplace.getClearAllSpan().click();
    }

    @Test
    public void verifyCategoryCheck() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        // landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin(userEmail,userPass);;
        landing.getMarketplace().click();
        marketplace.getCyberSecurityCheck().click();
        Assert.assertEquals(marketplace.getCyberSecurityLabel().getText(), "Cyber security");
        marketplace.getClearAllSpan().click();
    }


    @Test
    public void verifyProductTypeCheck() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        //  landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin(userEmail,userPass);;
        landing.getMarketplace().click();
        marketplace.getFreeCheck().click();
        Assert.assertEquals(marketplace.getFreeLabel().getText(), "Free");
        marketplace.getClearAllSpan().click();

    }

    @Test
    public void verifyProviderSelect() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        //  landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin(userEmail,userPass);;
        landing.getMarketplace().click();
        scrollDown(0, 500);
        marketplace.getProviderSelect().click();
        marketplace.getOptionProviderSelect().click();
        Assert.assertEquals(marketplace.getProviderSelect().getText(), "Cisco");
        marketplace.getClearAllSpan().click();

    }

    @Test
    public void verifySearcher() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);


        // landing.getCookiesAcceptBtn().click();
        landing.getLogin().click();
        login.signin(userEmail,userPass);;
        landing.getMarketplace().click();

        marketplace.getSearchInput().click();
        marketplace.getSearchInput().sendKeys("Energy Transition Outlook 2021 dataset");
        marketplace.getSearchInputResult().click();
        Assert.assertEquals(marketplace.getTestProductTitle().getText(), "Energy Transition Outlook 2021 dataset");

    }

    @AfterTest
    public void teardown() {

        driver.close();
    }

}
