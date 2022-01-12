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

public class ObtainProductTest extends Base {
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
        log = LogManager.getLogger(ObtainProductTest.class.getName());
        log.info("Driver is initialized");
        driver.get(props.getProperty("url"));
        log.info("Navigated to Home page");
    }

    @Test
    public void obtainProductTest() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        MarketplacePage marketplace = new MarketplacePage(driver);

        landing.getCookiesAcceptBtn().click();
        log.debug("Cookie alert accepted");
        landing.getLogin().click();
        log.debug("On login window");
        login.signin(userEmail,userPass);
        log.info("login succesful");
        landing.getMarketplace().click();
        log.debug("On Marketplace window");
        marketplace.getTestProduct().click();
        log.debug("On Product window");
        Assert.assertEquals(marketplace.getTestProductTitle().getText(), "Energy Transition Outlook 2021 dataset");
        log.info("The product is right!");
        marketplace.getFreeAccessButton().click();
        log.debug("Free access button accepted");
        marketplace.getTermsBtnAccept().click();
        log.debug("Terms and conditions acepted");
        marketplace.getGoMyDataBtn().click();
        log.debug("On My data ");
        Assert.assertEquals(marketplace.getDataTitleProductObtained().getText(), "ETO 2021");
        log.info("The product is obtained successfully");
    }

    @AfterTest
    public void teardown() {
           driver.quit();
    }
}
