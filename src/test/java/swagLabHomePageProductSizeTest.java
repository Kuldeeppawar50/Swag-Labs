import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.LaunchBrowser;
import pom.swagLabHomePage;
import pom.swagLabLoginPage;

public class swagLabHomePageProductSizeTest extends Basic {
    @BeforeMethod
    public void openBrowser() {
        driver = LaunchBrowser.openBrowser("https://www.saucedemo.com/");
    }

    @Test
    public void verifyHomePageNumberOfProducts() {
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("standard_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
        swagLabHomePage swaglabhomepage = new swagLabHomePage(driver);
       int Totalproductsize=swaglabhomepage.homePageProductDisplayedSize();
        Assert.assertEquals(Totalproductsize,6);
    }
}