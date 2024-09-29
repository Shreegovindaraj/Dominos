package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home_Page {
    WebDriver driver;

    // Constructor to initialize driver
    public Home_Page(WebDriver driver) {
        this.driver = driver;
    }
    // Method to get the page title
    public String getHomePageTitle() {
        return driver.getTitle();
    }
    // Method to navigate to the home page
    public void navigateToHomePage() {
        driver.get("https://www.dominos.co.in/");
    }
    public By clickOrder = By.xpath("//button[normalize-space()='ORDER ONLINE NOW']");
    public By clickAddress = By.xpath("//input[@placeholder='Enter your delivery address']");
    public By clickBox = By.xpath("//input[@placeholder='Enter Area / Locality']");
    public By suggestion = By.xpath("//div[@class='sc-fBuWsC eMOfwp']//child::li[@data-label='location_[object Object]'][1]");
    public By popup = By.xpath("//button[@onclick='moeRemoveBanner()']");
    public By checkBox = By.xpath("//input[@data-label='checkbox']");
    public By thanks = By.xpath("//span[normalize-space()='NO THANKS']");

    public void clickOrderOnline() {
        driver.findElement(clickOrder).click();
    }
    public void setClickDelivery() {
        driver.findElement(clickAddress).click();
    }
    public void setClickBox() {
        driver.findElement(clickBox).sendKeys("600100");
    }
    public void selectSuggestion(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Wait up to 10 seconds
        WebElement suggestionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(suggestion));
        suggestionElement.click();
    }
    public void clickPopup(){
        if(checkBox==null){
            System.out.println("No Check Box");
        }else driver.findElement(popup).click();
    }
    public void clickCheckBox(){
        if(checkBox==null){
            System.out.println("No Check Box");
        }else driver.findElement(checkBox).click();
    }
    public void noThanks(){
        if(thanks==null){
            System.out.println("No Thanks");
        }else driver.findElement(thanks).click();
    }
}
