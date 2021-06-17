package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class YourShoppingCartPage extends Utility {

    By verifyTextYourShoppingCart1Item = By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]");
    By clearQuantityTo0 = By.xpath("//input[@id='amount16']");
    By changeQuantityTo2 = By.xpath("//input[@id='amount16']");
    By verifyTextYourShoppingCart2Items = By.xpath("//h1[contains(text(),'Your shopping cart - 2 items')]");
    By verifySubtotal = By.xpath("//ul[@class='sums']/li/span");
    By verifyTotal = By.xpath("//li[@class='total']/span/span[1]");
    By clickGoToCheckoutButton = By.xpath("//span[contains(text(),'Go to checkout')]");
    By clickOnEmptyYourCartLink = By.xpath("//a[contains(text(),'Empty your cart')]");
    By verifyTextItemsDeletedFromYourCart = By.id("status-messages");
    By verifyTextYourCartIsEmpty = By.xpath("//h1[contains(text(),'Your cart is empty')]");

    public String getTextYourShoppingCart1Item() {
        Reporter.log("Verify the Text, Your Shopping Cart 1 Item" + verifyTextYourShoppingCart1Item.toString() + "<br>");
        return getTextFromElement(verifyTextYourShoppingCart1Item);
    }

    public void setClearQuantityTo0() {
        Reporter.log("Clear Quantity to 0" + clearQuantityTo0.toString() + "<br>");
        driver.findElement(clearQuantityTo0).clear();
    }

    public void setChangeQuantityTo2() {
        Reporter.log("Change Quantity to 2" + changeQuantityTo2.toString() + "<br>");
        sendTextToElement(changeQuantityTo2,"2");
    }

    public String getTextYourShoppingCart2Items() {
        Reporter.log("Verify the Text, Your Shopping Cart 2 Items" + verifyTextYourShoppingCart2Items.toString() + "<br>");
        return getTextFromElement(verifyTextYourShoppingCart2Items);
    }

    public String setVerifySubtotal() {
        Reporter.log("Verify Subtotal" + verifySubtotal.toString() + "<br>");
        return getTextFromElement(verifySubtotal);
    }

    public String setVerifyTotal() {
        Reporter.log("Verify Total" + verifyTotal.toString() + "<br>");
        return getTextFromElement(verifyTotal);
    }

    public void setClickGoToCheckoutButton() {
        Reporter.log("Click Go To Checkout Button" + clickGoToCheckoutButton.toString() + "<br>");
        clickOnElement(clickGoToCheckoutButton);
    }

    public void setClickOnEmptyYourCartLink() {
        Reporter.log("Click on Empty Your Cart Link" + clickOnEmptyYourCartLink.toString() + "<br>");
        clickOnElement(clickOnEmptyYourCartLink);
    }

    public String getTextItemsDeletedFromYourCart() {
        Reporter.log("Verify Text, Items Deleted From Your Cart" + verifyTextItemsDeletedFromYourCart.toString() + "<br>");
        return getTextFromElement(verifyTextItemsDeletedFromYourCart);
    }

    public String getTextYourCartIsEmpty() {
        Reporter.log("Verify the Text, Your Cart Is Empty" + verifyTextYourCartIsEmpty.toString() + "<br>");
        return getTextFromElement(verifyTextYourCartIsEmpty);
    }




}
