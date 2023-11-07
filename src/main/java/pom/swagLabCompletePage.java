package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swagLabCompletePage {
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement completepagetitle;
    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backhomebutton ;







    public swagLabCompletePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getCompletePageFinalStatus(){
        return completepagetitle.getText();
    }
    public void clickOnBackToHomeButton(){
        backhomebutton.click();
    }
}
