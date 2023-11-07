package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class swagLabHomePage {
    @FindBy(xpath = "//div[@class=\'inventory_item_name \']")
    private List<WebElement> homepageproductdisplayed;
    @FindBy(xpath = "//div[@class=\'inventory_item_name \']")
    private List<WebElement> product;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private List<WebElement> productprice;
    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    private WebElement addtocartbutton;
    @FindBy(xpath = "//button[@class='btn btn_secondary back btn_large inventory_details_back_button']")
    private WebElement backtoproductbutton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removebutton;
    @FindBy(xpath = "//div[@class=\'inventory_item_name \']")
    private WebElement allproduct;
    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    private WebElement cartbutton;



    public swagLabHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public int homePageProductDisplayedSize() {
        return homepageproductdisplayed.size();
    }

    public void clickOnProduct(int index) {
        product.get(index).click();
    }
    public String getProductTitle(int index){
        return product.get(index).getText();
    }
    public String getProductPrice(int index){
       return productprice.get(index).getText();
    }

    public void clickOnAddToCartButton() {
        addtocartbutton.click();
    }

    public String getTitleOfCartButton() {
        return addtocartbutton.getText();
    }

    public void clickOnBackToProductButton() {
        backtoproductbutton.click();
    }

    public String getTitleRemoveButton() {
        return removebutton.getText();
    }

    public void clickOnRemoveButton() {
        removebutton.click();
    }

    public void clickOnAllProduct() {
        for (int i = 0; i <= product.size() - 1; i++) {
            WebElement j = product.get(i);
            j.click();
            String cartbuttonname = addtocartbutton.getText();
            addtocartbutton.click();
            backtoproductbutton.click();
            String removebuttonname = removebutton.getText();
            Assert.assertFalse(cartbuttonname.contains(removebuttonname));
        }

    }

    public void clickOnCartButton() {
        cartbutton.click();
    }





    }

