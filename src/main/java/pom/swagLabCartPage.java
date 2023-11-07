package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class swagLabCartPage {
    @FindBy(xpath = "//button[@class='btn btn_secondary back btn_medium']")
    private WebElement continueshopingbutton;
    @FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button ']")
    private WebElement checkoutbutton;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private WebElement cartproductprice;


    public swagLabCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickOnContinueShoppingButton() {
        continueshopingbutton.click();
    }
    public String getCartProductPrice(){
        return cartproductprice.getText();
    }
    public void clickOnCheckoutButton() {
        checkoutbutton.click();
    }


}
