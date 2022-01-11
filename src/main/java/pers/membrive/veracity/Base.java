package pers.membrive.veracity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {

    public WebDriver driver;
    public Properties props;
    public WebDriver setupDriver() throws IOException {

        props = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/data.properties");

        props.load(fis);
        String browserName = props.getProperty("browser");


        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/windows/chromedriver.exe");
            driver = new ChromeDriver();


        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/windows/geckodriver.exe");
            driver = new FirefoxDriver();

        }

        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        return driver;
    }

    public void scrollDown(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
    }


}
