package pers.membrive.veracity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {

        public WebDriver driver;
    public WebDriver setupDriver() throws IOException {

        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("src/main/java/pers/membrive/veracity/data.properties");

        props.load(fis);
        String browserName = props.getProperty("browser");


        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/windows/chromedriver.exe");
             driver = new ChromeDriver();


        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/windows/geckodriver.exe");
             driver = new FirefoxDriver();

        }

        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
}