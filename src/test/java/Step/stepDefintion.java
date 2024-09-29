package Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Base_Class.Base_Class;
import org.Pom.Home_Page;
import org.Pom.Pepsi;
import org.Pom.Sub_Total;
import org.Pom.Veg_Pizza;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class stepDefintion extends Base_Class {
    WebDriver driver;
    Home_Page HomePage;
    Veg_Pizza VegPizza;
    Pepsi pepsi;
    Sub_Total subTotal;

    @Given("I launch {string} browser")
    public void i_launch_browser(String browser) {
        initializeDriver(browser);
        driver = getDriver();
        HomePage = new Home_Page(driver);
        VegPizza = new Veg_Pizza(driver);
        pepsi = new Pepsi(driver);
        subTotal = new Sub_Total(driver);
    }
    @When("I navigate to the home page")
    public void i_navigate_to_the_home_page() {
        HomePage.navigateToHomePage();
    }
    @Then("I verify the page title is displayed")
    public void i_verify_the_page_title_is_displayed() {
        String homePageTitle = HomePage.getHomePageTitle();
        System.out.println("Page Title is :" + homePageTitle);

    }
    @Then("user click order online now")
    public void userClickOrderOnlineNow() throws InterruptedException {
        HomePage.clickOrderOnline();
        HomePage.setClickDelivery();
        Thread.sleep(5000);
    }
    @And("user click enter address and enter pinCode and select first suggestion")
    public void userClickEnterAddressAndEnterPinCodeAndSelectFirstSuggestion() throws InterruptedException {
        HomePage.setClickBox();
        Thread.sleep(5000);
        HomePage.selectSuggestion();
        Thread.sleep(5000);
        HomePage.clickPopup();
        Thread.sleep(5000);
    }
    @And("user goes to veg pizza section to add {string} as quantity {int}")
    public void userGoesToVegPizzaSectionAndAddAsQuantity(String pizza1, int qty1)  throws InterruptedException {
        VegPizza.clickMargheritaBtn();
        Thread.sleep(5000);
        HomePage.clickCheckBox();
        Thread.sleep(5000);
        HomePage.noThanks();
        Thread.sleep(5000);
    }
    @And("user want to add {int} {string} and {int} {string} pizzas to my cart")
    public void userWantToAddAndPizzasToMyCart(int qty2, String pizza2, int qty3, String pizza3) throws InterruptedException {
        VegPizza.clickPrimaveraBtn();
        Thread.sleep(5000);
        VegPizza.clickPeppyPAnEerBtn();
        Thread.sleep(5000);
        VegPizza.clickMargheritaQty();
        Thread.sleep(5000);
        VegPizza.clickPrimaveraQty();
        Thread.sleep(5000);
        VegPizza.clickPeppyPAnEerQty();
        Thread.sleep(5000);

    }
    @And("user goes to beverages section and select {string} with quantity {int}")
    public void userGoesToBeveragesSectionAndSelectWithQuantity(String pepsi475ml, int qty12) throws InterruptedException {
        pepsi.clickPepsi();
        Thread.sleep(5000);
        pepsi.clickPepsiQty();
        Thread.sleep(5000);

    }
    @Then("user verifies the Sum of Each Product quantities and their amount")
    public void user_verifies_the_sum_of_each_product_quantities_and_their_amount() throws InterruptedException {
        subTotal.getAllAmount();
        Thread.sleep(5000);

    }
    @And("user goes to the veg section in  removing {string} pizza with quantity {int}")
    public void userGoesToTheVegSectionInRemovingPizzaWithQuantity(String pizza1, int qty1) throws InterruptedException{
        VegPizza.clickDecreaseMargherita();
        Thread.sleep(5000);

    }
    @And("user goes to the beverages section and removing {string} with quantity {int}")
    public void userGoesToTheBeveragesSectionAndRemovingWithQuantity(String pepsi475ml, int qty6) throws InterruptedException{
        pepsi.clickDecreasePepsiQty();
        Thread.sleep(5000);

    }
    @Then("user verifies Cart Subtotal Value with Sum of Each Product Value and quantity after removing products")
    public void userVerifiesCartSubtotalValueWithSumOfEachProductValueAndQuantityAfterRemovingProducts() throws InterruptedException {
        subTotal.getAfterReduce();
        Thread.sleep(5000);

    }
    @And("user Get Sub Total Value & Click Check Out")
    public void userGetSubTotalValueClickCheckOut() throws InterruptedException {
        subTotal.ClickCheckOut();
        Thread.sleep(5000);
    }

    @Then("user verifies the Subtotal Checkout With Subtotal Place Order Price Details")
    public void userVerifiesTheSubtotalCheckoutWithSubtotalPlaceOrderPriceDetails() throws InterruptedException {
        subTotal.AfterCheckIndividual();
        Thread.sleep(5000);
        subTotal.FinalSuBTotal();
        Thread.sleep(5000);
        subTotal.GetStoredAfterCheckout();


    }
}
