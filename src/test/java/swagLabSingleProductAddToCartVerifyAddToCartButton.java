import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.LaunchBrowser;
import pom.swagLabCartPage;
import pom.swagLabHomePage;
import pom.swagLabLoginPage;

public class swagLabSingleProductAddToCartVerifyAddToCartButton extends Basic{
    @BeforeMethod
    public void openBrowser() {
        driver = LaunchBrowser.openBrowser("https://www.saucedemo.com/");
    }

    @Test
    public void verifyIsSingleProductAddedOnCartUsingAddToCartButton()  {
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("standard_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
        swagLabHomePage swaglabhomepage = new swagLabHomePage(driver);
        swaglabhomepage.clickOnProduct(0);
        String cartbutton = swaglabhomepage.getTitleOfCartButton();
        swaglabhomepage.clickOnAddToCartButton();
        swaglabhomepage.clickOnCartButton();
        swaglabhomepage.clickOnRemoveButton();
        swagLabCartPage swaglabcartpage = new swagLabCartPage(driver);
        swaglabcartpage.clickOnContinueShoppingButton();
        swaglabhomepage.clickOnProduct(0);
        String cartButton = swaglabhomepage.getTitleOfCartButton();
        Assert.assertTrue(cartButton.contains(cartbutton));

    }
}
