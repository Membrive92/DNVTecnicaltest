package pers.membrive.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarketplacePage {

    public WebDriver driver;

    public MarketplacePage(WebDriver driver) {
        this.driver = driver;
    }


    By searchInput = By.xpath("//input[@type=\"text\" and @placeholder=\"Search the marketplace\"]");

    By oil_GasCheck = By.id("oil-and-gas");

    By cyber_SecurityCheck = By.id("cyber-security");

    By freeCheck = By.id("free");

    By providerSelect = By.id("//*[@id=\"home-filter\"]");

    By popularitySelect = By.id("sort-by");




    // inside product card

    By testProduct = By.xpath("//h3[text() = \"Energy Transition Outlook 2021 dataset\"]");

    By freeAccessButton = By.xpath("//button[@class = \"_Button_41ac2\" and text() = \"Free access\"]");

    By termsBtnCancel = By.xpath("//button[@class=\"_Button_41ac2\" and text() = \"Cancel\"]");

    By termsBtnAccept = By.xpath("//button[@class=\"_Button_41ac2\" and text() = \"I accept\"]");

    By goMyDataBtn =  By.xpath("//td[@class=\"_step-action_34e20\"]//a[@data-variant=\"green\" and text() = \"Go to My data\"]");


    //pending to add verification with card of my data section



    public WebElement getSearchInput(){
        return driver.findElement(searchInput);
    }

    public WebElement getOilGasCheck(){
        return driver.findElement(oil_GasCheck);
    }

    public WebElement getCyberSecurityCheck(){
        return driver.findElement(cyber_SecurityCheck);
    }

    public WebElement getFreeCheck(){
        return driver.findElement(freeCheck);
    }

    public WebElement getProviderSelect(){
        return driver.findElement(providerSelect);
    }

    public WebElement getPopularitySelect(){
        return driver.findElement(popularitySelect);
    }

    public WebElement getTestProduct(){
        return driver.findElement(testProduct);
    }

    public WebElement getFreeAccessButton(){
        return driver.findElement(freeAccessButton);
    }

    public WebElement getTermsBtnCancel(){
        return driver.findElement(termsBtnCancel);
    }

    public WebElement getTermsBtnAccept(){
        return driver.findElement(termsBtnAccept);
    }

    public WebElement getGoMyDataBtn(){
        return driver.findElement(goMyDataBtn);
    }







}
