package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pepsi {
    public WebDriver driver;

    public Pepsi(WebDriver driver){
        this.driver=driver;
    }
    public By pepsi = By.xpath("//div[@data-label='Pepsi 475ml']//button[@data-label='addTocart']");
    public By pepsiQty = By.xpath("(//div[@class='crt-itms']//descendant::div[@class='crt-bdy']//following-sibling::div[@class='crt-cnt-qty-prc']//following::div[@data-label='increase'])[4]");
    public By DecreasePepsiQty = By.xpath("(//div[@class='crt-itms']//descendant::div[@class='crt-bdy']//following-sibling::div[@class='crt-cnt-qty-prc']//following::div[@data-label='decrease'])[4]");

    public void clickPepsi(){driver.findElement(pepsi).click();}
    public void clickPepsiQty(){
        for (int i = 0; i<=10; i++){
            driver.findElement(pepsiQty).click();
        }
    }
    public void clickDecreasePepsiQty() {
        for (int i = 0; i<6; i++) {
            driver.findElement(DecreasePepsiQty).click();
        }
    }
}
