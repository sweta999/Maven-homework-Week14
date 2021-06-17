package demo.xcart.homepage;

import demo.xcart.pages.*;
import demo.xcart.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homepage = new HomePage();             // Object create for HomePage global
    ShippingPage shipping = new ShippingPage();     // Object create for ShippingPage globally
    NewPage newPage = new NewPage();                // Object create for NewPage globally
    ComingSoon comingSoon = new ComingSoon();       // Object create for ComingSoonPage globally
    ContactUs contactUs = new ContactUs();          // Object create for ComingSoonPage globally

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {

        Thread.sleep(3000);
        homepage.clickOnShippingLink();
        String expectedMsg1 = "Shipping";
        String actualMsg1 = shipping.getTextShipping();
        Assert.assertEquals(actualMsg1, expectedMsg1);
    }

    @Test(groups ={"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToNewPageSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        homepage.clickOnNewLink();
        String expectedMsg2 = "New arrivals";
        String actualMsg2 = newPage.getTextNewarrivals();
        Assert.assertEquals(actualMsg2, expectedMsg2);
    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        homepage.clickOnComingSoon();
        String expectedMsg3 = "Coming soon";
        String actualMsg3 = comingSoon.getTextComingSoon();
        Assert.assertEquals(actualMsg3, expectedMsg3);
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToContactUSPageSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        homepage.clickOnContactUs();
        String expectedMsg4 = "Contact us";
        String actualMsg4 = contactUs.getTextContactUs();
        Assert.assertEquals(actualMsg4, expectedMsg4);

    }


}
