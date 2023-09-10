package step_definitions;

import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private final WebDriver driver = Hooks.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @When("User click button checkout")
    public void ClickButtonCheckout(){
        checkoutPage.clickButtonCheckout();
    }

    @When("User input {string} as a first name {string} as a last name {string} As a zip")
    public void inputFirstName(String frtName,String lstName,String zp) {
        checkoutPage.setFirstName(frtName);
        checkoutPage.setLastName(lstName);
        checkoutPage.setZip(zp);
    }
    @When("User click button continue")
    public void ClickButtonContinue(){
        checkoutPage.clickButtonContinue();
    }

    @When("User Check {string} with price {string}")
    public void CheckPrice(String item, String price){
        String p = checkoutPage.getPrice(item);
        Assert.assertTrue(p.contains(price));
    }
    @When("User click button finish")
    public void ClickButtonFinish() {
        checkoutPage.clickButtonFinish();
    }
    @When("User see {string} in the page")
    public void userFinishOrder(String item) {
        checkoutPage.verifyPageAlreadyInCheckoutComplete(item);
    }
}
