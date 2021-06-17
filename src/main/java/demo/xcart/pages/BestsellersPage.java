package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestsellersPage extends Utility {

    By verifyTextBestsellers = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By selectNameZtoA = By.xpath("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[5]/a");
    By verifyProductArrangeZtoA = By.xpath("//span[contains(text(),'Name Z - A')]");
    By selectPriceHighToLow = By.xpath("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[3]/a");
    By verifyProductHighToLow = By.xpath("//span[contains(text(),'Price High - Low')]");
    By selectRates = By.xpath("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[6]/a");
    By verifyProductArrangeByRates = By.xpath("//span[contains(text(),'Rates')]");
    By selectNameAtoZ = By.xpath("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[4]/a");
    By clickAddToCartVinylIdolzGhostbusters = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']"); //button[@class='btn  regular-button add-to-cart product-add2cart productid-13']
    By verifyMsgProductAddedToCart = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeTheMessageProductAddedToCart = By.xpath("//div[@id='status-messages']/a");
    By clickYourCartIcon = By.xpath("//div[@title='Your cart']");
    By clickOnViewCartButton = By.xpath("//span[contains(text(),'View cart')]");



    public String getTextBestsellers() {
        Reporter.log("Verify Message Bestsellers" + verifyTextBestsellers.toString() + "<br>");
        return getTextFromElement(verifyTextBestsellers);
    }

    public void setMouseHoverOnSortBy() {
        Reporter.log("Mouse hover on Sort By" + mouseHoverOnSortBy.toString() + "<br>");
        mouseHoverToElement(mouseHoverOnSortBy);
    }

    public void setSelectNameZtoA() {
        Reporter.log("Select Name Z to A and click" + selectNameZtoA.toString() + "<br>");
        mouseHoverToElementAndClick(selectNameZtoA);
    }

    public void setVerifyProductArrangeZtoA() {
        Reporter.log("Verify Product is arrange Z to A" + verifyProductArrangeZtoA.toString() + "<br>");
        selectByValueVisibleText((verifyProductArrangeZtoA), "Name: Z to A");

        //Getting list of web elements of product name
        List<WebElement> sortByList = driver.findElements(By.id("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[5]/a"));

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

    public void setSelectPriceHightoLow() {
        Reporter.log("Select Price High to Low" + selectPriceHighToLow.toString() + "<br>");
        mouseHoverToElementAndClick(selectPriceHighToLow);
    }

    public void setVerifyProductArrangeHightoLow() {
        Reporter.log("Verify Product is arrange High to Low" + verifyProductHighToLow.toString() + "<br>");
        selectByValueVisibleText((verifyProductHighToLow), "Price High - Low");

        //Getting list of web elements of product name
        List<WebElement> sortByList = driver.findElements(By.id("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[3]/a"));

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
        Reporter.log("Verify Product is arrange by Rates" + verifyProductArrangeByRates.toString() + "<br>");
        selectByValueVisibleText((verifyProductArrangeByRates), "Rates");

        //Getting list of web elements of product name
        List<WebElement> sortByList = driver.findElements(By.id("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[6]/a"));

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

    public void setSelectNameAtoZ() {
        Reporter.log("Select Name A to Z and click" + selectNameAtoZ.toString() + "<br>");
        mouseHoverToElementAndClick(selectNameAtoZ);
    }

    public void setClickAddToCartVinylIdolzGhostbusters() {
        Reporter.log("Click Add to Cart for VinylIdol Ghosbusters" + clickAddToCartVinylIdolzGhostbusters.toString() + "<br>");
        mouseHoverToElementAndClick(clickAddToCartVinylIdolzGhostbusters);
    }

    public String getMessageProductAddedToCart() {
        Reporter.log("Verify Message Product Added to Cart" + verifyMsgProductAddedToCart.toString() + "<br>");
        return getTextFromElement(verifyMsgProductAddedToCart);
    }

    public void setCloseTheMessageProductAddedToCart() {
        Reporter.log("Verify Message Product Added to Cart is closed" + closeTheMessageProductAddedToCart.toString() + "<br>");
        clickOnElement(closeTheMessageProductAddedToCart);
    }

    public void setClickYourCartIcon() {
        Reporter.log("Click to Your Cart Icon" + clickYourCartIcon.toString() + "<br>");
        clickOnElement(clickYourCartIcon);
    }

    public void setClickOnViewCartButton() {
        Reporter.log("Click on View Cart Button" + clickOnViewCartButton.toString() + "<br>");
        clickOnElement(clickOnViewCartButton);
    }









}
