import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.LaunchBrowser;
import pom.swagLabHomePage;
import pom.swagLabLoginPage;

public class swagLabSingleProductAddToCartVerifyRemoveButton extends Basic {
    @BeforeMethod
    public void openBrowser() {
        driver = LaunchBrowser.openBrowser("https://www.saucedemo.com/");
    }

    @Test
    public void verifyIsSingleProductAddedOnCartUsingRemoveButton() {
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("standard_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
        swagLabHomePage swaglabhomepage = new swagLabHomePage(driver);
        swaglabhomepage.clickOnProduct(0);
        String cartbutton = swaglabhomepage.getTitleOfCartButton();
        swaglabhomepage.clickOnAddToCartButton();
        swaglabhomepage.clickOnBackToProductButton();
        String removebutton = swaglabhomepage.getTitleRemoveButton();
        Assert.assertFalse(removebutton.contains(cartbutton));
    }
}