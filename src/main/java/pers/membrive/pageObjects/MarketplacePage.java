package pers.membrive.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MarketplacePage {

    public WebDriver driver;

    Select select;

    public MarketplacePage(WebDriver driver) {
        this.driver = driver;
    }


    By searchInput = By.xpath("//input[@type=\"text\" and @placeholder=\"Search the marketplace\"]");

    By searchInputResult = By.xpath(" //*[@class=\"_search-result_fe0a9\" and @href=\"/energy-transition-outlook\"]");

    By oil_GasCheck = By.xpath("//*[@id=\"oil-and-gas\"]//ancestor::span[@class=\"_checkbox_35871\"]");

    By oilGasSelectedLabel = By.xpath("//span[@class=\"_tip-wrapper_b8e1c\" and text() = \"Oil and gas\"]");

    By cyber_SecurityCheck = By.xpath("//*[@id=\"cyber-security\"]//ancestor::span[@class=\"_checkbox_35871\"]");

    By cyberSecuritySelectedLabel = By.xpath("//span[@class=\"_tip-wrapper_b8e1c\" and text() = \"Cyber security\"]");

    By freeCheck = By.xpath("//*[@id=\"free\"]//ancestor::span[@class=\"_checkbox_35871\"]");

    By freeSelectedLabel = By.xpath("//span[@class=\"_tip-wrapper_b8e1c\" and text() = \"Free\"]");

    By providerSelect = By.xpath("//*[@class=\"home-filter-selector\"]");

    By ciscoOptionSelect = By.xpath("//*[@id=\"downshift-0-item-4\" and text() = \"Cisco\"]");

    By clearAllChecks = By.xpath("//div[@class=\"_filter-title_867e0\"]//a[@class = \"_right_867e0 _clear-all_867e0\"]");


    // inside product card

    By testProductTitle = By.xpath("//h1[@class=\"_Title_991e1\"]");

    By testProduct = By.xpath("//h3[text() = \"Energy Transition Outlook 2021 dataset\"]");

    By freeAccessButton = By.xpath("//button[@class = \"_Button_41ac2\" and text() = \"Free access\"]");

    By termsBtnCancel = By.xpath("//button[@class=\"_Button_41ac2\" and text() = \"Cancel\"]");

    By termsBtnAccept = By.xpath("//button[@class=\"_Button_41ac2\" and text() = \"I accept\"]");

    By goMyDataBtn = By.xpath("//td[@class=\"_step-action_34e20\"]//a[@data-variant=\"green\" and text() = \"Go to My data\"]");

    By dataTitleProductObtained = By.xpath("//div[@class=\"tileTitle\" and text() = \"ETO 2021\"]");


    //pending to add verification with card of my data section


    public WebElement getSearchInput() {
        return driver.findElement(searchInput);
    }

    public WebElement getSearchInputResult() {
        return driver.findElement(searchInputResult);
    }

    public WebElement getTestProductTitle() {
        return driver.findElement(testProductTitle);
    }

    public WebElement getOilGasCheck() {
        return driver.findElement(oil_GasCheck);
    }

    public WebElement getOilGasLabel() {
        return driver.findElement(oilGasSelectedLabel);
    }

    public WebElement getCyberSecurityCheck() {
        return driver.findElement(cyber_SecurityCheck);
    }

    public WebElement getCyberSecurityLabel() {
        return driver.findElement(cyberSecuritySelectedLabel);
    }

    public WebElement getFreeCheck() {
        return driver.findElement(freeCheck);
    }

    public WebElement getFreeLabel() {
        return driver.findElement(freeSelectedLabel);
    }

    public WebElement getProviderSelect() {
        return driver.findElement(providerSelect);
    }

    public WebElement getOptionProviderSelect() {
        // select = new Select(driver.findElement(ciscoOptionSelect));
        return driver.findElement(ciscoOptionSelect);

    }

    public WebElement getClearAllSpan() {
        return driver.findElement(clearAllChecks);
    }

    public WebElement getTestProduct() {
        return driver.findElement(testProduct);
    }

    public WebElement getFreeAccessButton() {
        return driver.findElement(freeAccessButton);
    }

    public WebElement getTermsBtnCancel() {
        return driver.findElement(termsBtnCancel);
    }

    public WebElement getTermsBtnAccept() {
        return driver.findElement(termsBtnAccept);
    }

    public WebElement getGoMyDataBtn() {
        return driver.findElement(goMyDataBtn);
    }

    public WebElement getDataTitleProductObtained() {
        return driver.findElement(dataTitleProductObtained);
    }


}
