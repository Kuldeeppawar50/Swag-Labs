import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.LaunchBrowser;
import pom.swagLabLoginPage;

public class swagLabLoginPageTestCase extends Basic {

    @BeforeMethod
    public void openBrowser(){
        driver = LaunchBrowser.openBrowser("https://www.saucedemo.com/");
    }

    @Test
    public void loginWithStandardUser(){
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("standard_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
    }
    @Test
    public void loginWithLockedOutUser(){
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("locked_out_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
    }
    @Test
    public void loginWithProblemUser(){
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("problem_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
    }
    @Test
    public void loginWithPerformanceGlitchUser(){
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("performance_glitch_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
    }
    @Test
    public void loginWithErrorUser(){
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("error_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
    }
    @Test
    public void loginWithVisualUser(){
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("visual_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
    }
}

