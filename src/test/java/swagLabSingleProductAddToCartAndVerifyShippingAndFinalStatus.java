import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.LaunchBrowser;
import pom.*;

public class swagLabSingleProductAddToCartAndVerifyShippingAndFinalStatus extends Basic {
    @BeforeMethod
    public void openBrowser() {
        driver = LaunchBrowser.openBrowser("https://www.saucedemo.com/");
    }

    @Test
    public void PriceCalculationOverviewPage() {
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("standard_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
        swagLabHomePage swaglabhomepage = new swagLabHomePage(driver);
        swaglabhomepage.clickOnProduct(0);
        swaglabhomepage.clickOnAddToCartButton();
        swaglabhomepage.clickOnCartButton();
        swagLabCartPage swaglabcartpage = new swagLabCartPage(driver);
        swaglabcartpage.clickOnCheckoutButton();
        swagLabYourInformationPage sawglabyourinformationpage = new swagLabYourInformationPage(driver);
        sawglabyourinformationpage.enterFirstName("abcd");
        sawglabyourinformationpage.enterLastName("pqrs");
        sawglabyourinformationpage.enterPostalCode("1234");
        sawglabyourinformationpage.clickOnContinueButton();
        swagLabOverviewPage swaglaboverviewpage = new swagLabOverviewPage(driver);
        swaglaboverviewpage.clickOnFinishButton();
        swagLabCompletePage swaglabcompletepage = new swagLabCompletePage(driver);
        String finalstatus = swaglabcompletepage.getCompletePageFinalStatus();
        Assert.assertEquals(finalstatus,"Thank you for your order!");
        swaglabcompletepage.clickOnBackToHomeButton();
    }
}