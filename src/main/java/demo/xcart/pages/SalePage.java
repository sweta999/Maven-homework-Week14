package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalePage extends Utility {

    By verifyTextSale = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By selectNameAtoZ = By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']/li[5]/a");
    //By verifyAlphabeticalOrder = By.xpath("//span[contains(text(),'Name A - Z')]");
    By verifyAlphabeticalOrder = By.xpath("//h5[@class='product-name']/ancestor::div[@class='products']");
    By selectPriceLowToHigh = By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']/li[3]/a");
    By verifyProductLowToHigh = By.xpath("//span[contains(text(),'Price Low - High')]");
    By selectRates = By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']/li[7]/a");
    By verifyProductArrangeByRates = By.xpath("//span[contains(text(),'Rates')]");
    By clickAddToCartForAvengersFabrikationsPlush = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-16']/span");
    By verifyMsgProductAddedToCart = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeTheMessageProductAddedToCart = By.xpath("//div[@id='status-messages']/a");
    By clickYourCartIcon = By.xpath("//div[@title='Your cart']");
    By clickOnViewCartButton = By.xpath("//span[contains(text(),'View cart')]");

    public String getTextSale() {
        Reporter.log("Verify the Text, Sale" + verifyTextSale.toString() + "<br>");
        return getTextFromElement(verifyTextSale);
    }

    public void setMouseHoverOnSortBy() {
        Reporter.log("Mouse hover on SortBy" + mouseHoverOnSortBy.toString() + "<br>");
        mouseHoverToElement(mouseHoverOnSortBy);
    }

    public void setSelectNameAtoZ() {
        Reporter.log("Select Name A to Z and Click" + selectNameAtoZ.toString() + "<br>");
        mouseHoverToElementAndClick(selectNameAtoZ);
    }

    public void verifyProductArrangeAlphabetically() {
        Reporter.log("Verify the product arrange alphabetically" + verifyAlphabeticalOrder.toString() + "<br>");
        //selectByValueVisibleText((verifyAlphabeticalOrder), "Name: A to Z");//

        //Getting list of web elements of product name
        List<WebElement> sortByList = driver.findElements(verifyAlphabeticalOrder); //h5[@class='product-name']/ancestor::div[@class='products']

        List<String> productName = new ArrayList<>();
        for (WebElement sort : sortByList) {
            productName.add(sort.getText());

            List<String> templist = new ArrayList<>();  // temporary array list
            templist.addAll(productName);

            Collections.sort(templist);  // Collections.sort(templist); -> for Asc only
            System.out.println(productName);
            System.out.println(templist);

            Assert.assertEquals(productName, templist);
        }
    }

    public void setSelectPriceLowtoHigh() {
        Reporter.log("Select Price Low to High" + selectPriceLowToHigh.toString() + "<br>");
        mouseHoverToElementAndClick(selectPriceLowToHigh);
    }

    public void verifyProductArrangePriceLowtoHigh() {
        Reporter.log("Verify the product arrange Low to High" + verifyProductLowToHigh.toString() + "<br>");
        selectByValueVisibleText((verifyProductLowToHigh), "Price Low - High");

        //Getting list of web elements of product name
        List<WebElement> sortByList = driver.findElements(By.id("XLite-Module-CDev-Sale-View-SalePage-sortby-1']/li[3]/a"));

        List<String> productName = new ArrayList<>();
        for (WebElement sort : sortByList) {
            productName.add(sort.getText());

            List<String> templist = new ArrayList<>();  // temporary array list
            templist.addAll(productName);

            Collections.sort(templist);  // Collections.sort(templist); -> for Asc only
            System.out.println(productName);
            System.out.println(templist);

            Assert.assertEquals(productName, templist);
        }
    }

    public void setSelectRates() {
        Reporter.log("Select Product by Rates" + selectRates.toString() + "<br>");
        mouseHoverToElementAndClick(selectRates);
    }

    public void verifyProductArrangeByRates() {
        Reporter.log("Verify the product arrange by Rates" + verifyProductArrangeByRates.toString() + "<br>");
        selectByValueVisibleText((verifyProductArrangeByRates), "Rates");

        //Getting list of web elements of product name
        List<WebElement> sortByList = driver.findElements(By.id("XLite-Module-CDev-Sale-View-SalePage-sortby-1']/li[7]/a"));

        List<String> productName = new ArrayList<>();
        for (WebElement sort : sortByList) {
            productName.add(sort.getText());

            List<String> templist = new ArrayList<>();  // temporary array list
            templist.addAll(productName);

            Collections.sort(templist);  // Collections.sort(templist); -> for Asc only
            System.out.println(productName);
            System.out.println(templist);

            Assert.assertEquals(productName, templist);
        }
    }

    public void setClickAddToCartForAvengersFabrikationsPlush() {
        Reporter.log("Click Add to Cart for Avengers Fabrikations Plush" + clickAddToCartForAvengersFabrikationsPlush.toString() + "<br>");
        clickOnElement(clickAddToCartForAvengersFabrikationsPlush);
    }

    public String getMessageProductAddedToCart() {
        Reporter.log("Verify Message Product Added to Cart" + verifyMsgProductAddedToCart.toString() + "<br>");
        return getTextFromElement(verifyMsgProductAddedToCart);
    }

    public void setCloseTheMessageProductAddedToCart() {
        Reporter.log("Verify Message Product to Cart is Closed" + closeTheMessageProductAddedToCart.toString() + "<br>");
        clickOnElement(closeTheMessageProductAddedToCart);
    }

    public void setClickYourCartIcon() {
        Reporter.log("Clicking Your Cart Icon" + clickYourCartIcon.toString() + "<br>");
        clickOnElement(clickYourCartIcon);
    }

    public void setClickOnViewCartButton() {
        Reporter.log("Click on View Cart Button" + clickOnViewCartButton.toString() + "<br>");
        clickOnElement(clickOnViewCartButton);
    }
}