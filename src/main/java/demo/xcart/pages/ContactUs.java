package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ContactUs extends Utility {

    By verifyTextContactUs = By.xpath("//div[@class='list-container']/h1");

    public String getTextContactUs() {
        Reporter.log("Verify the Text, Contact us" + verifyTextContactUs.toString() + "<br>");
        return getTextFromElement(verifyTextContactUs);
    }
}
