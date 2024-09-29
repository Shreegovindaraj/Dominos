package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Sub_Total {
    public WebDriver driver;

    public Sub_Total(WebDriver driver) {
        this.driver = driver;
    }

    public By AllAmount = By.xpath("//div[@class='crt-itms']//following::span[@class='crt-cnt-qty-prc-txt']");
    public By AfterReduce = By.xpath("//div[@class='crt-itms']//following::span[@class='crt-cnt-qty-prc-txt']");
    public By CheckOut = By.xpath("//button[@data-label='miniCartCheckout']");
    public By subtotal = By.xpath("//span[contains(text(),'2597.84')]");
    public By individual = By.xpath("//div[@class='flex']//following::div[@class='price']");

    public List<String> allAmounts = new ArrayList<>();

    public void getAllAmount() {
       List<WebElement> SubTotal = driver.findElements(AllAmount);
       for (WebElement element : SubTotal) {
           String amount = element.getText();
           allAmounts.add(amount);
           System.out.println("Amount: " + amount);
       }
   }
    public List<String> GetStoredAmounts() {
        return allAmounts;
    }

    public List<String> afterItemReduce = new ArrayList<>();
    public void getAfterReduce() {
        List<WebElement> SubTotal = driver.findElements(AfterReduce);
        double totalSum = 0;  // Variable to store the sum of all amounts
        for (WebElement element : SubTotal) {
            String amount = element.getText(); //.replace(",", "");
            double AmountValue = Double.parseDouble(amount);
            totalSum += AmountValue;
            afterItemReduce.add(amount);
            System.out.println("Amount: " + amount);
        }
        System.out.println("Total Sum of All Reduced Items: " + totalSum);
    }
    public List<String> GetStoreDAfterReduce() {
        return afterItemReduce;
    }
    public void ClickCheckOut(){
        driver.findElement(CheckOut).click();
    }

    public String FinalSuBTotal(){
        WebElement subTotalElement = driver.findElement(subtotal);
        String subTotalText = subTotalElement.getText();
        System.out.println("Subtotal displayed on page: " + subTotalText);
        return subTotalText;
    }
    public List<String> afterCheckout = new ArrayList<>();
    public void AfterCheckIndividual(){
        List<WebElement> SubTotal = driver.findElements(individual);
        double totalIndividualSum = 0;
        for (WebElement element : SubTotal) {
            String individualAmount = element.getText(); //.replace(",", "");
            double AmountValue = Double.parseDouble(individualAmount);
            totalIndividualSum += AmountValue;
            afterCheckout.add(individualAmount);
            System.out.println("Amount: " + individualAmount);
        }
        System.out.println("Total Sum of All Reduced Items: " + totalIndividualSum);
        String finalSubtotalString = FinalSuBTotal().replace(",", ""); // Remove commas if needed
        double finalSubtotalValue = Double.parseDouble(finalSubtotalString);

        if (finalSubtotalValue == totalIndividualSum) {
            System.out.println("Final subtotal and total individual sum are equal.");
        } else {
            System.out.println("Final subtotal and total individual sum are NOT equal.");
        }
    }
    public List<String> GetStoredAfterCheckout() {
        return afterCheckout;
    }
}





