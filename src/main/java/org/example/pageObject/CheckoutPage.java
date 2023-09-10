package org.example.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class   CheckoutPage {
    public static WebDriver webDriver;

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zip;




    public void clickButtonCheckout(){
        String xpath = "//button[@id='checkout']";
        webDriver.findElement(By.xpath(xpath)).click();
    }

    public void setFirstName(String frtName){
        firstName.sendKeys(frtName);
    }
    public void setLastName(String lstName){
        lastName.sendKeys(lstName);
    }
    public void setZip(String zp){
        zip.sendKeys(zp);
    }
    public void clickButtonContinue(){
        String xpath = "//input[@id='continue']";
        webDriver.findElement(By.xpath(xpath)).click();
    }
    public String getPrice(String item) {
        String xpath = "//div[@class='"+item+"']";
        return webDriver.findElement(By.xpath(xpath)).getText();
    }
    public void clickButtonFinish(){
        String xpath = "//button[@id='finish']";
        webDriver.findElement(By.xpath(xpath)).click();
    }
    public void verifyPageAlreadyInCheckoutComplete(String item) {
        String xpath = "//h2[@class='complete-header']";
        webDriver.findElement(By.xpath(xpath)).isDisplayed();
    }
}

