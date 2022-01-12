package pers.membrive.veracity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pers.membrive.pageObjects.LandingPage;
import pers.membrive.pageObjects.LoginPage;
import java.io.IOException;

public class LoginTest extends Base{

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
        log = LogManager.getLogger(LoginTest.class.getName());
        log.info("Driver is initialized");
        driver.get(props.getProperty("url"));
        log.info("Navigated to Home page");
    }

    @Test(groups = {"mitest"})
    public void loginTest() throws IOException
    {
        LandingPage landing = new LandingPage(driver);
        LoginPage login = new LoginPage(driver);
        landing.getCookiesAcceptBtn().click();
        log.debug("Cookie alert accepted");
        landing.getLogin().click();
        log.debug("On login window");
        login.signin(userEmail,userPass);
        log.info("login succesful");
    }

    @AfterTest
    public void teardown() {
        driver.close();
    }
}
