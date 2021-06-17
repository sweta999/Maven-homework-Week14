package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By ShippingLink = By.xpath("//div[@class='collapse navbar-collapse']/ul/li[3]");
    By NewLink = By.xpath("//div[@class='collapse navbar-collapse']/ul/li[4]");
    By ComingSoon = By.xpath("//div[@class='collapse navbar-collapse']/ul/li[5]");
    By ContactUs = By.xpath("//div[@class='collapse navbar-collapse']/ul/li[6]");
    By HotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/span");
    By SaleLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul/li[1]");
    By BestsellersLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul/li[2]");


    public void clickOnShippingLink() {
        Reporter.log("Click on Shipping Link" + ShippingLink.toString() + "<br>");
        mouseHoverToElementAndClick(ShippingLink);
    }

    public void clickOnNewLink() {
        Reporter.log("Click on New Link" + NewLink.toString() + "<br>");
        mouseHoverToElementAndClick(NewLink);
    }

    public void clickOnComingSoon() {
        Reporter.log("Click on Coming Soon Link" + ComingSoon.toString() + "<br>");
        mouseHoverToElementAndClick(ComingSoon);
    }

    public void clickOnContactUs() {
        Reporter.log("Click on Contact Us Link" + ContactUs.toString() + "<br>");
        mouseHoverToElementAndClick(ContactUs);
    }

    public void mouseHoverOnHotDeals() {
        Reporter.log("Mouse hover on Hot Deals" + HotDeals.toString() + "<br>");
        mouseHoverToElement(HotDeals);
    }

    public void mouseHoverOnSaleLinkAndClick() {
        Reporter.log("Mouse hover on Sale Link and Click" + SaleLink.toString() + "<br>");
        mouseHoverToElementAndClick(SaleLink);
    }

    public void mouseHoverOnBestsellersLinkAndClick() {
        Reporter.log("Mouse hover on Bestsellers Link and Click" + BestsellersLink.toString() + "<br>");
        mouseHoverToElementAndClick(BestsellersLink);
    }

















}