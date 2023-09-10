package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class   HomePage {
    public static WebDriver webDriver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        webDriver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement filterProduct;
    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement filterCart;


    public void selectFilterProduct(String fltrProduct){
        Select filter = new Select(filterProduct);
        filter.selectByVisibleText(fltrProduct);
    }
    public void clickButtonAddToCard(String item){
        String xpath = "//div[text()='" + item + "']/ancestor::div[@class='inventory_item']//button";
        webDriver.findElement(By.xpath(xpath)).click();
    }
    public void clickButtonCart(){
        String xpath = "//div[@id='shopping_cart_container']/a[1]";
        webDriver.findElement(By.xpath(xpath)).click();
    }

    public void checkItemInCart(String item) {
        String xpath = "//div[.='"+item+"']";
        webDriver.findElement(By.xpath(xpath)).isDisplayed();
    }
    public void removeItemInCart(String item){
        String xpath = "//button[@id='remove-sauce-labs-onesie']";
        webDriver.findElement(By.xpath(xpath)).click();
    }
}

