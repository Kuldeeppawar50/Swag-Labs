import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.LaunchBrowser;
import pom.*;

public class swagLabSingleProductAddToCartAndVerifyPriceCalculationOnOverviewPage extends Basic {
    @BeforeMethod
    public void openBrowser() {
        driver = LaunchBrowser.openBrowser("https://www.saucedemo.com/");
    }

    @Test
    public void PriceCalculationOverviewPage()  {
        swagLabLoginPage swaglabloginpage = new swagLabLoginPage(driver);
        swaglabloginpage.userName("standard_user");
        swaglabloginpage.passWord("secret_sauce");
        swaglabloginpage.Login();
        swagLabHomePage swaglabhomepage = new swagLabHomePage(driver);
        String homepageproducttitle = swaglabhomepage.getProductTitle(0);
        String homepageproductprice = swaglabhomepage.getProductPrice(0);
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
        String overviewproducttitle = swaglaboverviewpage.getOverviewProductTitle();
        Assert.assertTrue(overviewproducttitle.contains(homepageproducttitle));
        String overviewproductprice = swaglaboverviewpage.getOverviewProductPrice();
        Assert.assertTrue(overviewproductprice.contains(homepageproductprice));
        String itemprice = swaglaboverviewpage.getItemTotalPrice().substring(13);
        Double Itemprice = Double.parseDouble(itemprice);
        System.out.println(Itemprice);
        String tax = swaglaboverviewpage.getTaxPrice().substring(6);
        Double Tax = Double.parseDouble(tax);
        System.out.println(Tax);
        Double pricetotal = Itemprice + Tax;
        String PriceTotal = Double.toString(pricetotal);
        String TotalPrice = swaglaboverviewpage.getTotalPrice().substring(8);
        Assert.assertTrue(TotalPrice.contains(PriceTotal));
    }
}