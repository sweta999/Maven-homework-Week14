package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ShippingPage extends Utility {

    By verifyTextShipping = By.xpath("//div[@class='list-container']/h1");

    public String getTextShipping() {
        Reporter.log("Verify the Text, Shipping" + verifyTextShipping.toString() + "<br>");
        return getTextFromElement(verifyTextShipping);
    }

}
