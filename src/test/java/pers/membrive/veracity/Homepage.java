package pers.membrive.veracity;

import org.testng.annotations.Test;
import pers.membrive.pageObjects.LandingPage;

import java.io.IOException;

public class Homepage extends Base {
    
    @Test
    public void navigateToBase() throws IOException {
        driver = setupDriver();
        driver.get("https://www.veracity.com");

        LandingPage landing = new LandingPage(driver);
          landing.getMarketplace().click();

        
    }
}
