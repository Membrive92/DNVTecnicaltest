package pers.membrive.veracity;

import org.testng.annotations.Test;

import java.io.IOException;

public class Homepage extends Base {
    
    @Test
    public void navigateToBase() throws IOException {
        driver = setupDriver();
        driver.get("https://www.dnv.es");

        
    }
}
