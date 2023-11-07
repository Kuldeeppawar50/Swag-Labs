import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.LaunchBrowser;
import pom.swagLabHomePage;
import pom.swagLabLoginPage;

public class swagLabMultipleProductAddToCartVerifyRemoveButton extends Basic {
    @BeforeMethod
    public void openBrowser() {
        driver = LaunchBrowser.openBrowser("https://www.saucedemo.com/");
    }


    @Test
    public void verifyIsMultipleProductAddedOnCartUsingRemoveButton()  {
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("standard_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
        swagLabHomePage swaglabhomepage = new swagLabHomePage(driver);
        swaglabhomepage.clickOnProduct(0);
        String cartbuttonfirstproduct = swaglabhomepage.getTitleOfCartButton();
        swaglabhomepage.clickOnAddToCartButton();
        swaglabhomepage.clickOnBackToProductButton();
        String removebuttonfirstproduct = swaglabhomepage.getTitleRemoveButton();
        Assert.assertFalse(removebuttonfirstproduct.contains(cartbuttonfirstproduct));
        swaglabhomepage.clickOnProduct(1);
        String cartbuttonsecondproduct = swaglabhomepage.getTitleOfCartButton();
        swaglabhomepage.clickOnAddToCartButton();
        swaglabhomepage.clickOnBackToProductButton();
        String removebuttonsecondproduct = swaglabhomepage.getTitleRemoveButton();
        Assert.assertFalse(removebuttonsecondproduct.contains(cartbuttonsecondproduct));

    }
}