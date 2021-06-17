package demo.xcart.shopping;

import demo.xcart.pages.*;
import demo.xcart.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {

    HomePage homepage = new HomePage();             // Object create for HomePage global
    SalePage salepage = new SalePage();
    BestsellersPage bestsellersPage = new BestsellersPage();
    YourShoppingCartPage shoppingCartPage = new YourShoppingCartPage();
    LogInToYourAccountPage logInToYourAccountPage = new LogInToYourAccountPage();
    SecureCheckoutPage secureCheckoutPage = new SecureCheckoutPage();


    @Test(groups ={"sanity", "regression"})
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersFabrikationsPlush() throws InterruptedException {

        homepage.mouseHoverOnHotDeals();
        homepage.mouseHoverOnSaleLinkAndClick();

        String expectedMsg1 = "Sale";
        String actualMsg1 = salepage.getTextSale();
        Assert.assertEquals(actualMsg1, expectedMsg1);
        salepage.setMouseHoverOnSortBy();
        salepage.setSelectNameAtoZ();
        Thread.sleep(2000);
        salepage.setClickAddToCartForAvengersFabrikationsPlush();
        String expectedMsg2 = "Product has been added to your cart";
        String actualMsg2 = salepage.getMessageProductAddedToCart();
        Assert.assertEquals(actualMsg2, expectedMsg2);
        salepage.setCloseTheMessageProductAddedToCart();
        salepage.setClickYourCartIcon();
        Thread.sleep(2000);
        salepage.setClickOnViewCartButton();

        String expectedMsg3 = "Your shopping cart - 1 item";
        String actualMsg3 = shoppingCartPage.getTextYourShoppingCart1Item();
        Assert.assertEquals(actualMsg3, expectedMsg3);
        shoppingCartPage.setClearQuantityTo0();
        Thread.sleep(2000);
        shoppingCartPage.setChangeQuantityTo2();
        Thread.sleep(2000);
        String expectedMsg4 = "Your shopping cart - 2 items";
        String actualMsg4 = shoppingCartPage.getTextYourShoppingCart2Items();
        Assert.assertEquals(actualMsg4, expectedMsg4);
        String expectedMsg5 = "$29.98";
        String actualMsg5 = shoppingCartPage.setVerifySubtotal();
        Assert.assertEquals(actualMsg5, expectedMsg5);
        String expectedMsg6 = "$36.00";
        String actualMsg6 = shoppingCartPage.setVerifyTotal();
        Assert.assertEquals(actualMsg6, expectedMsg6);
        Thread.sleep(2000);
        shoppingCartPage.setClickGoToCheckoutButton();

        String expectedMsg7 = "Log in to your account";
        String actualMsg7 = logInToYourAccountPage.getTextLogInToYourAccount();
        Assert.assertEquals(actualMsg7, expectedMsg7);
        Thread.sleep(2000);
        logInToYourAccountPage.getEmailAddress();
        logInToYourAccountPage.setClickOnContinueButton();
        Thread.sleep(2000);
        String expectedMsg8 = "Secure Checkout";
        String actualMsg8 = logInToYourAccountPage.getTextSecureCheckout();
        Assert.assertEquals(actualMsg8, expectedMsg8);

        secureCheckoutPage.setEnterFirstname();
        secureCheckoutPage.setEnterLastname();
        secureCheckoutPage.setEnterAddress();
        secureCheckoutPage.setState();
        Thread.sleep(2000);
        secureCheckoutPage.setSelectDeliverMethodToLocalShipping();
        secureCheckoutPage.setSelectPaymentMethodCOD();
        Thread.sleep(2000);
        String expectedMsg9 = "$37.03";
        String actualMsg9 = secureCheckoutPage.getVerifyTotal$37cent03();
        Assert.assertEquals(actualMsg9, expectedMsg9);
        Thread.sleep(2000);
        secureCheckoutPage.setClickOnPlaceOrderButton();
        Thread.sleep(2000);
        String expectedMsg10 = "Thank you for your order";
        String actualMsg10 = secureCheckoutPage.getVerifyTextThankYouForYourOrder();
        Assert.assertEquals(actualMsg10, expectedMsg10);
    }

    @Test(groups ={"sanity","smoke","regression"})
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {

        homepage.mouseHoverOnHotDeals();
        homepage.mouseHoverOnBestsellersLinkAndClick();

        String expectedMsg1 = "Bestsellers";
        String actualMsg1 = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualMsg1, expectedMsg1);
        Thread.sleep(2000);
        bestsellersPage.setMouseHoverOnSortBy();
        bestsellersPage.setSelectNameAtoZ();
        Thread.sleep(2000);
        bestsellersPage.setClickAddToCartVinylIdolzGhostbusters();
        bestsellersPage.getMessageProductAddedToCart();
        bestsellersPage.setCloseTheMessageProductAddedToCart();
        Thread.sleep(2000);
        bestsellersPage.setClickYourCartIcon();
        bestsellersPage.setClickOnViewCartButton();

        String expectedMsg2 = "Your shopping cart - 1 item";
        String actualMsg2 = shoppingCartPage.getTextYourShoppingCart1Item();
        Assert.assertEquals(actualMsg2, expectedMsg2);
        shoppingCartPage.setClickOnEmptyYourCartLink();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();  //switch to alert
        String alertMessage = driver.switchTo().alert().getText(); // capture alert message
        String expectedMessage = "Are you sure you want to clear your cart?";
        Assert.assertEquals(expectedMessage,alertMessage);
        alert.accept();
        Thread.sleep(2000);
        String expectedMsg3 = "Item(s) deleted from your cart";
        String actualMsg3 = shoppingCartPage.getTextItemsDeletedFromYourCart();
        Assert.assertEquals(actualMsg3, expectedMsg3);
        Thread.sleep(2000);
        String expectedMsg4 = "Your cart is empty";
        String actualMsg4 = shoppingCartPage.getTextYourCartIsEmpty();
        Assert.assertEquals(actualMsg4, expectedMsg4);

    }

}
