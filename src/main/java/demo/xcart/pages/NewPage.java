package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class NewPage extends Utility {

    By verifyTextNewarrivals = By.xpath("//div[@class='list-container']/h1");

    public String getTextNewarrivals() {
        Reporter.log("Verify the Text, New arrivals" + verifyTextNewarrivals.toString() + "<br>");
        return getTextFromElement(verifyTextNewarrivals);
    }
}
