package org.Pom;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Veg_Pizza {
    WebDriver driver;
    WebDriverWait wait;

    public Veg_Pizza(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public By Margherita = By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//span[contains(text(),'ADD TO CART')]");
    public By Primavera = By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//span[contains(text(),'ADD TO CART')]");
    public By PeppyPAnEer = By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//button[@data-label='addTocart']");
    public By MargheritaQty = By.xpath("(//div[@class='crt-itms']//descendant::div[@class='crt-bdy']//following-sibling::div[@class='crt-cnt-qty-prc']//following::div[@data-label='increase'])[1]");
    public By PrimaveraQty = By.xpath("(//div[@class='crt-itms']//descendant::div[@class='crt-bdy']//following-sibling::div[@class='crt-cnt-qty-prc']//following::div[@data-label='increase'])[2]");
    public By PeppyPAnEerQty = By.xpath("(//div[@class='crt-itms']//descendant::div[@class='crt-bdy']//following-sibling::div[@class='crt-cnt-qty-prc']//following::div[@data-label='increase'])[3]");
    public By DecreaseMargherita = By.xpath("(//div[@class='crt-itms']//descendant::div[@class='crt-bdy']//following-sibling::div[@class='crt-cnt-qty-prc']//following::div[@data-label='decrease'])[1]");

    public void clickMargheritaBtn(){driver.findElement(Margherita).click();}
    public void clickPrimaveraBtn() {
        driver.findElement(Primavera).click();
    }
    public void clickPeppyPAnEerBtn() {
        driver.findElement(PeppyPAnEer).click();
    }
    public void clickMargheritaQty(){  driver.findElement(MargheritaQty).click();}
    public void clickPrimaveraQty(){driver.findElement(PrimaveraQty).click();}
    public void clickPeppyPAnEerQty(){driver.findElement(PeppyPAnEerQty).click();}
    public void clickDecreaseMargherita(){driver.findElement(DecreaseMargherita).click();}


}
