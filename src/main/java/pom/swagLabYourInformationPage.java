package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swagLabYourInformationPage {
    @FindBy(xpath = "(//input[@class='input_error form_input'])[1]")
    private WebElement firstname;
    @FindBy(xpath = "(//input[@class='input_error form_input'])[2]")
    private WebElement lastname;
    @FindBy(xpath = "(//input[@class='input_error form_input'])[3]")
    private WebElement postalcode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continuebutton;
    @FindBy(xpath = "//button[@id='cancel']")
    private WebElement cancelbutton;




    public swagLabYourInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void enterFirstName(String name){
        firstname.sendKeys(name);
    }
    public void enterLastName(String name){
        lastname.sendKeys(name);
    }
    public void enterPostalCode(String pcode){
        postalcode.sendKeys(pcode);
    }
    public void clickOnContinueButton(){
        continuebutton.click();
    }
    public void clickOnCancelButton(){
        cancelbutton.click();
    }

}
