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

public class VerifyCategoryCheck extends Base {

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
        log = LogManager.getLogger(VerifyCategoryCheck.class.getName());

        log.info("Driver is initialized");
        driver.get(props.getProperty("url"));
        log.info("Navigated to Home page");
    }



    @Test
    public void verifyCategoryCheck() throws IOException
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



    @AfterTest
    public void teardown() {
        if(driver != null)
        driver.quit();
    }

}