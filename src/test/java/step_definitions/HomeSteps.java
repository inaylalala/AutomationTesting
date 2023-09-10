package step_definitions;

import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @When("User filter list  product by {string}")
    public void selectFilterProduct(String filterProduct){
        homePage.selectFilterProduct(filterProduct);
    }
    @When("User click item {string}")
    public void clickButtonAddToCardItem(String item){
        homePage.clickButtonAddToCard(item);
    }
    @When("User click filter cart")
    public void clickButtonCart(){
        homePage.clickButtonCart();
    }
    @When("User see {string} in the cart")
    public void userSeeInTheCart(String item) {
        homePage.checkItemInCart(item);
    }

    @When("User remove {string} in the cart")
    public void userRemoveItemInCart(String item) {
        homePage.removeItemInCart(item);
    }
}
