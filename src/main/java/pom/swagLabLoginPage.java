package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swagLabLoginPage {
    @FindBy(xpath = "//input[@id='user-name']") private WebElement username;
    @FindBy(xpath = "//input[@id='password']") private WebElement pass;
    @FindBy(xpath = "//input[@id='login-button']") private WebElement login;


    public swagLabLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void userName(String userName) {
        username.sendKeys(userName);
    }
    public void passWord(String password) {
        pass.sendKeys(password);
    }
    public void Login() {
        login.click();
    }

}
