import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.LaunchBrowser;
import pom.swagLabCartPage;
import pom.swagLabHomePage;
import pom.swagLabLoginPage;

public class swagLabSingleProductAddToCartAndVerifyCartPrice extends Basic {
    @BeforeMethod
    public void openBrowser() {
        driver = LaunchBrowser.openBrowser("https://www.saucedemo.com/");
    }

    @Test
    public void verifyIsSingleProductAddToCartAndVerifyPrice() {
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("standard_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
        swagLabHomePage swaglabhomepage = new swagLabHomePage(driver);
        String homepageproductprice = swaglabhomepage.getProductPrice(0);
        swaglabhomepage.clickOnProduct(0);
        swaglabhomepage.clickOnAddToCartButton();
        swaglabhomepage.clickOnCartButton();
        swagLabCartPage swaglabcartpage = new swagLabCartPage(driver);
        String cartproductprice = swaglabcartpage.getCartProductPrice();
        Assert.assertTrue(cartproductprice.contains(homepageproductprice));

    }
}