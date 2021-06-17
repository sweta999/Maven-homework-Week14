package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ComingSoon extends Utility {

    By verifyTextComingSoon = By.xpath("//div[@class='list-container']/h1");

    public String getTextComingSoon() {
        Reporter.log("Verify the Text, Coming soon" + verifyTextComingSoon.toString() + "<br>");
        return getTextFromElement(verifyTextComingSoon);
    }
}
