package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swagLabOverviewPage {
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement overviewproducttitle;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private WebElement overviewproducprice;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemtotal;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement total;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishbutton;







    public swagLabOverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getOverviewProductTitle(){
       return overviewproducttitle.getText();
    }
    public String getOverviewProductPrice(){
        return overviewproducprice.getText();
    }
    public String getItemTotalPrice(){
        return itemtotal.getText();
    }
    public String getTaxPrice(){
        return tax.getText();
    }
    public String getTotalPrice(){
        return total.getText();
    }
    public void clickOnFinishButton(){
        finishbutton.click();
    }




}
