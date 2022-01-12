package pers.membrive.veracity;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

//Base class use for manage browsers and driver properties
public class Base {
    public WebDriver driver;
    public Properties props;
    public WebDriver setupDriver() throws IOException {

        //properties load from src/java/resources/data.properties
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

    //method for take screenshot and build screenshot
    public void getScreenshotPath(String testCaseName,  WebDriver driver) throws IOException {
        TakesScreenshot takeScreen =(TakesScreenshot) driver;
        File source = takeScreen.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
        FileUtils.copyFile(source,new File(destinationFile));
    }
}
