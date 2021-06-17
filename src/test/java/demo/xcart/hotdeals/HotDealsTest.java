package demo.xcart.hotdeals;

import demo.xcart.pages.BestsellersPage;
import demo.xcart.pages.HomePage;
import demo.xcart.pages.SalePage;
import demo.xcart.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {

    HomePage homepage = new HomePage();             // Object create for HomePage global
    SalePage salepage = new SalePage();
    BestsellersPage bestsellersPage = new BestsellersPage();

    @Test(groups = {"sanity", "regression"})
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {

        homepage.mouseHoverOnHotDeals();
        homepage.mouseHoverOnSaleLinkAndClick();
        Thread.sleep(2000);
        String expectedMsg1 = "Sale";
        String actualMsg1 = salepage.getTextSale();
        Assert.assertEquals(actualMsg1, expectedMsg1);
        salepage.setMouseHoverOnSortBy();
        Thread.sleep(2000);
        salepage.setSelectNameAtoZ();
        salepage.verifyProductArrangeAlphabetically();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {

        homepage.mouseHoverOnHotDeals();
        homepage.mouseHoverOnSaleLinkAndClick();
        Thread.sleep(2000);
        String expectedMsg1 = "Sale";
        String actualMsg1 = salepage.getTextSale();
        Assert.assertEquals(actualMsg1, expectedMsg1);
        salepage.setMouseHoverOnSortBy();
        Thread.sleep(2000);
        salepage.setSelectPriceLowtoHigh();
        salepage.verifyProductArrangePriceLowtoHigh();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifySaleProductsArrangeByRates() throws InterruptedException {

        homepage.mouseHoverOnHotDeals();
        Thread.sleep(2000);
        homepage.mouseHoverOnSaleLinkAndClick();
        String expectedMsg1 = "Sale";
        String actualMsg1 = salepage.getTextSale();
        Assert.assertEquals(actualMsg1, expectedMsg1);
        Thread.sleep(2000);
        salepage.setMouseHoverOnSortBy();
        salepage.setSelectRates();
        salepage.verifyProductArrangeByRates();
    }

    @Test(groups = {"smoke",  "regression"})
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {

        homepage.mouseHoverOnHotDeals();
        homepage.mouseHoverOnBestsellersLinkAndClick();
        Thread.sleep(2000);
        String expectedMsg1 = "Bestsellers";
        String actualMsg1 = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualMsg1, expectedMsg1);
        bestsellersPage.setMouseHoverOnSortBy();
        Thread.sleep(2000);
        bestsellersPage.setSelectNameZtoA();
        bestsellersPage.setVerifyProductArrangeZtoA();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyBestSellersProductPriceArrangeHighToLow() throws InterruptedException {

        Thread.sleep(2000);
        homepage.mouseHoverOnHotDeals();
        homepage.mouseHoverOnBestsellersLinkAndClick();
        String expectedMsg1 = "Bestsellers";
        String actualMsg1 = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualMsg1, expectedMsg1);
        Thread.sleep(2000);
        bestsellersPage.setMouseHoverOnSortBy();
        bestsellersPage.setSelectPriceHightoLow();
        bestsellersPage.setVerifyProductArrangeHightoLow();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {

        homepage.mouseHoverOnHotDeals();
        Thread.sleep(2000);
        homepage.mouseHoverOnBestsellersLinkAndClick();
        String expectedMsg1 = "Bestsellers";
        String actualMsg1 = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualMsg1, expectedMsg1);
        bestsellersPage.setMouseHoverOnSortBy();
        Thread.sleep(2000);
        bestsellersPage.setSelectRates();
        bestsellersPage.verifyProductArrangeByRates();
    }


}
